package main.Lanci;


import main.Lanci.Dado;

//Scrivi un programma che simuli il lancio di un dado e di una moneta stampandone il risultato; 
//con e senza l'utilizzo di una classe astratta che rappresenti i comportamenti comuni degli oggetti dado e moneta istanziati.
public class Lanci {
	public static void main(String[] args) {
		
//		//Simulare lancio di una moneta
//		
//		Random random = new Random();
//		boolean moneta = random.nextBoolean();
//		
//		if(moneta == true) {
//			System.out.println("Testa");
//		} else {
//			System.out.println("Croce");
//		}
//		
//		//Simulare lancio dado
//		int dado = random.nextInt(5);
//		System.out.println("Dado: " + (dado+1));
		
		
		Moneta moneta = new Moneta();
		Dado dado = new Dado();
		
		moneta.StampaRisultato();
		dado.StampaRisultato();
		
	}
}
