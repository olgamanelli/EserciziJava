package main.Dijkstra;

import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Dijkstra {

	public static void main(String[] args) {

		//IMPLEMENTARE IL GRAFO

		//creazione della lista dei punti
		List<Punto> listaPunti = new ArrayList<Punto>();

		Punto puntoA = new Punto(0,0);
		Punto puntoB = new Punto(0.5,-1);
		Punto puntoC = new Punto(1,1);
		Punto puntoD = new Punto(2,1);
		Punto puntoE = new Punto(2,3);
		Punto puntoF = new Punto(1,4);
		Punto puntoG = new Punto(5,5);

		listaPunti.add(puntoA);
		listaPunti.add(puntoB);
		listaPunti.add(puntoC);
		listaPunti.add(puntoD);
		listaPunti.add(puntoE);
		listaPunti.add(puntoF);
		listaPunti.add(puntoG);

		//Creazione delle mappe che permettono di sapere quali punti sono adiacenti
		Map<Punto, Map<Punto,Double>> mappaPuntiDistanze = new HashMap<Punto, Map<Punto,Double>>();

		Map<Punto,Double> mappaA = new HashMap<Punto, Double>();
		mappaA.put(puntoB, puntoA.distanza(puntoB));
		mappaA.put(puntoC, puntoA.distanza(puntoC));
		mappaPuntiDistanze.put(puntoA, mappaA);

		Map<Punto,Double> mappaB = new HashMap<Punto, Double>();
		mappaB.put(puntoA, puntoB.distanza(puntoA));
		mappaPuntiDistanze.put(puntoB, mappaB);

		Map<Punto,Double> mappaC = new HashMap<Punto, Double>();
		mappaC.put(puntoA, puntoC.distanza(puntoA));
		mappaC.put(puntoD, puntoC.distanza(puntoD));
		mappaC.put(puntoE, puntoC.distanza(puntoE));
		mappaPuntiDistanze.put(puntoC, mappaC);

		Map<Punto,Double> mappaD = new HashMap<Punto, Double>();
		mappaD.put(puntoC, puntoD.distanza(puntoC));
		mappaPuntiDistanze.put(puntoD, mappaD);

		Map<Punto,Double> mappaE = new HashMap<Punto, Double>();
		mappaE.put(puntoC, puntoE.distanza(puntoC));
		mappaE.put(puntoF, puntoE.distanza(puntoF));
		mappaPuntiDistanze.put(puntoE, mappaE);

		Map<Punto,Double> mappaF = new HashMap<Punto, Double>();
		mappaF.put(puntoE, puntoF.distanza(puntoE));
		mappaPuntiDistanze.put(puntoF, mappaF);

		Map<Punto,Double> mappaG = new HashMap<Punto, Double>();
		mappaPuntiDistanze.put(puntoG, mappaG);

		//costanti utili
		double inf = Double.POSITIVE_INFINITY;
		int numeroPunti = listaPunti.size();

		//scegliere vertice sorgente 
		Punto sorgente = puntoA;
		int indexSorgente = listaPunti.indexOf(sorgente);
		System.out.println("Sorgente: (" + sorgente.getX() + ", " + sorgente.getY() + ")");

		if(!listaPunti.contains(sorgente)) {
			System.out.println("Il punto scelto come sorgente non fa pare del grafo");
		}

		//IMPLEMENTARE LISTE AUSILIARIE

		//Creazione lista dei punti che sono già stati considerati, inizialmente 
		// si inserisce solo la sorgente
		List<Punto> listaPuntiConsiderati = new ArrayList<Punto>();

		//Creazione lista dei punti che non sono ancora stati considerati, inizialmente 
		//contiene tutti i punti tranne la sorgente
		List<Punto> listaPuntiDaScandire = new ArrayList<Punto>(listaPunti); 
		listaPuntiDaScandire.remove(indexSorgente);

		//Creazione della lista che in posizione x contiene il peso totale
		//del cammino (minimo) per arrivare al punto x dalla sorgente
		List<Double> pesiTotali = new ArrayList<Double>();

		//Creazione della lista che in posizione x contiene il punto che 
		//precede il punto x nel cammino minimo
		List<Punto> puntiPrecedenti = new ArrayList<Punto>();


		//Inizializzazione delle liste
		InizializzaListe(numeroPunti, indexSorgente, sorgente, pesiTotali, puntiPrecedenti,
				listaPunti, listaPuntiConsiderati, mappaPuntiDistanze);


		//Finchè la listaPuntiDaScandire non è vuota
		while(!listaPuntiDaScandire.isEmpty()) {

			//Se i restanti punti da Scandire sono tutti isolati, si esce dal while
			if(listaPuntiDaScandire.stream().allMatch(punto ->
			pesiTotali.get(listaPunti.indexOf(punto)).equals(inf))) {
				break;
			}

			//Si scorrono tutti i punti in listaPuntiDaScandire e 
			//si trova quello con peso minimo, chiamandolo puntoNuovo
			Punto puntoNuovo = TrovaNuovoPunto(listaPuntiDaScandire, listaPunti, pesiTotali);

			//Si aggiornano le liste

			try {
				AggiornaListe(listaPuntiDaScandire, listaPuntiConsiderati, listaPunti,
						puntiPrecedenti, pesiTotali, puntoNuovo, mappaPuntiDistanze);
			}catch(NullPointerException e){
				break; //si genera eccezione se il punto è isolato
			}
		}	

		//Stampa dei cammini minimi dalla sorgente a ogni altro punto
		StampaCamminiMinimi(listaPunti, pesiTotali, puntiPrecedenti, sorgente);


	}

	public static void InizializzaListe(int numeroPunti, int indexSorgente, Punto sorgente, List<Double> pesiTotali, 
			List<Punto> puntiPrecedenti, List<Punto> listaPunti, List<Punto> listaPuntiConsiderati, 
			Map<Punto, Map<Punto,Double>> mappaPuntiDistanze) {

		double inf = Double.POSITIVE_INFINITY;

		for(int i=0; i<numeroPunti;i++) {
			pesiTotali.add(inf);
		}
		pesiTotali.set(indexSorgente,0.0);


		for(int i=0; i<numeroPunti;i++) {
			puntiPrecedenti.add(null);
		}

		listaPuntiConsiderati.add(sorgente);

		//per ogni punto adiacente alla sorgente si pone PuntoPrecedente del punto = sorgente
		// e pesoTotale del cammino fino al punto = dist(sorgente,punto)
		List<Punto> listaPuntiAdiacentiAllaSorgente = new ArrayList<Punto>(mappaPuntiDistanze.get(sorgente).keySet());
		listaPuntiAdiacentiAllaSorgente.stream().forEach(punto -> {
			pesiTotali.set(listaPunti.indexOf(punto), sorgente.distanza(punto));
			puntiPrecedenti.set(listaPunti.indexOf(punto),sorgente);
		}); 
	}

	public static Punto TrovaNuovoPunto(List<Punto> listaPuntiDaScandire, List<Punto> listaPunti, List<Double> pesiTotali) {

		double min = Double.POSITIVE_INFINITY;
		Punto puntoNuovo = null;

		for(Punto punto:listaPuntiDaScandire) {
			if(pesiTotali.get(listaPunti.indexOf(punto)) < min) {
				puntoNuovo = punto;
				min = pesiTotali.get(listaPunti.indexOf(punto));
			}
		}

		return puntoNuovo;
	}

	public static void AggiornaListe(List<Punto> listaPuntiDaScandire, List<Punto> listaPuntiConsiderati, 
			List<Punto> listaPunti, List<Punto> puntiPrecedenti, List<Double> pesiTotali, Punto puntoNuovo, 
			Map<Punto, Map<Punto,Double>> mappaPuntiDistanze){

		//Si aggiorna listaPuntiDaScandire togliendo puntoNuovo e lo si mette in listaPuntiConsiderati
		listaPuntiDaScandire.remove(puntoNuovo);
		listaPuntiConsiderati.add(puntoNuovo);


		//Si calcola la lista dei punti adiacenti al punto nuovo
		List<Punto> listaPuntiAdiacentiAlPuntoNuovo = new ArrayList<Punto>
		(mappaPuntiDistanze.get(puntoNuovo).keySet());

		//Per ogni punto in listaPuntiAdiacentiAPuntoNuovo
		//e tale che pesiTotali[punto] > pesiTotali[puntoNuovo] + dist(punto,puntoNuovo)
		for(Punto punto:listaPuntiAdiacentiAlPuntoNuovo) {
			if(  listaPuntiDaScandire.contains(punto) && pesiTotali.get(listaPunti.indexOf(punto)) > 
			pesiTotali.get(listaPunti.indexOf(puntoNuovo)) + punto.distanza(puntoNuovo)) {

				//Si pone pesiTotali[punto] = pesiTotali[puntoNuovo] + dist(punto,puntoNuovo)
				//e puntoPrecedente[punto]=puntoNuovo;
				pesiTotali.set(listaPunti.indexOf(punto), pesiTotali.get(listaPunti.indexOf(puntoNuovo)) +
						punto.distanza(puntoNuovo));
				puntiPrecedenti.set(listaPunti.indexOf(punto), puntoNuovo);
			}
		}
	}

	public static void StampaCamminiMinimi(List<Punto> listaPunti, List<Double> pesiTotali, 
			List<Punto> puntiPrecedenti, Punto sorgente) {

		double inf = Double.POSITIVE_INFINITY;

		listaPunti.stream().forEach(puntoDestinazione->{
			if(pesiTotali.get(listaPunti.indexOf(puntoDestinazione))==inf) {
				System.out.println("Il punto (" + puntoDestinazione.getX() + ", " + puntoDestinazione.getY() + ")"
						+ " non è connesso alla sorgente!!");
			}else {
				if(!puntoDestinazione.equals(sorgente)) {
					//Si calcola il cammino minimo rileggendo al contrario la lista puntiPrecedenti
					Punto puntoIntermedio = puntiPrecedenti.get(listaPunti.indexOf(puntoDestinazione));		
					System.out.println("Il cammino più breve dalla sorgente al punto: (" + puntoDestinazione.getX() + ", " +
							puntoDestinazione.getY() + ") è lungo: " + pesiTotali.get(listaPunti.indexOf(puntoDestinazione)) +
							" ed è:");
					System.out.println("(" + puntoDestinazione.getX() + ", " + puntoDestinazione.getY() + ")");
					System.out.println("(" + puntoIntermedio.getX() + ", " + puntoIntermedio.getY() + ")");

					while(! puntoIntermedio.equals(sorgente)) {
						puntoIntermedio = puntiPrecedenti.get(listaPunti.indexOf(puntoIntermedio));
						System.out.println("(" + puntoIntermedio.getX() + ", " + puntoIntermedio.getY() + ")");
					}
				}
			}
		});
	}

}
