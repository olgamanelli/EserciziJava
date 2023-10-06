package main.AlgoritmoBerger;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class TestAlgoritmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		Map<Squadra, List<Squadra>> mappaSquadrePartite = new HashMap<>();
		List<Squadra> listaSquadre = new ArrayList<>();

		listaSquadre.add( new Squadra("Inter", false));
		listaSquadre.add(new Squadra("Milan", false));
		listaSquadre.add(new Squadra("Juve", false));
		listaSquadre.add(new Squadra("Roma", false));
		listaSquadre.add( new Squadra("A", false));
		listaSquadre.add(new Squadra("B", false));
		listaSquadre.add(new Squadra("C", false));
		listaSquadre.add(new Squadra("D", false));

		// lezione ternario
		//var = ifCondition ? cosaAssegnareAVarSeTrue : cosaAssegnareAVarSeFalse;

		//cicla per ogni giornata
		int numeroGiornate = listaSquadre.size()%2==0 ? listaSquadre.size() : listaSquadre.size() + 1;

		//		if(listaSquadre.size()%2==0) {
		//			numeroGiornate = listaSquadre.size();
		//		}else {
		//			numeroGiornate = listaSquadre.size()+1;
		//		}

		for(int indiceGiornata=1; indiceGiornata < numeroGiornate ; indiceGiornata++) {

			System.out.println("giornata numero: " + indiceGiornata);

			//è riniziata una nuova giornata, si rimette false a tutti gli isPlaying
			for(Squadra squadra : listaSquadre) {
				squadra.setPlaying(false);
			}

			//cicla per ogni squadra
			listaSquadre.stream().forEach(squadra1 ->{
				if(!squadra1.isPlaying()) {

					//ciclo sulle altre squadre
					
					listaSquadre.stream().forEach(squadra2 -> {
						
					});
					
					for(Squadra squadra2 : listaSquadre) {

						//se l'altra squadra non ha gia giocato e non è la prima squadra
						if(!squadra2.isPlaying() && !squadra1.equals(squadra2)) {

							//Vedere squadre contro cui squadra 1 ha gia giocato
							List<Squadra> squadreControCuiHaiGiaGiocato1 = new ArrayList<>();


							//controlla se è la prima partita che sta giocando
							if(mappaSquadrePartite.get(squadra1) != null) {
								//se cosi non fosse strae le squadre contro cui ha gia giocatp
								squadreControCuiHaiGiaGiocato1 = mappaSquadrePartite.get(squadra1);
							}

							//se nelle squadre con cui ho gia giocato non c'è squadra 2, ci gioco
							if(!squadreControCuiHaiGiaGiocato1.contains(squadra2)) {
								squadra1.setPlaying(true);
								squadra2.setPlaying(true);
								squadreControCuiHaiGiaGiocato1.add(squadra2);
								mappaSquadrePartite.put(squadra1,  squadreControCuiHaiGiaGiocato1);

								List<Squadra> squadreControCuiHaiGiaGiocato2 = new ArrayList<>();

								//prende squadre con cui ha gia giocato squadra 2
								if(mappaSquadrePartite.get(squadra2) != null) {
									squadreControCuiHaiGiaGiocato2 = mappaSquadrePartite.get(squadra2);
								}

								//aggiunge a queste squadre la squadra1
								squadreControCuiHaiGiaGiocato2.add(squadra1);
								mappaSquadrePartite.put(squadra2,  squadreControCuiHaiGiaGiocato2);


								System.out.println(squadra1.getNome() + " gioca contro " + squadra2.getNome() );

								break;

							}

						}
					}

				}
			});
			// for(int indexSquadra1 =0 ; indexSquadra1 < listaSquadre.size(); indexSquadra1 ++ ) {


			//se la squadra non ha gia giocato


		}

	}
}
