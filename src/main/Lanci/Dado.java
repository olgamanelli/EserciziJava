package main.Lanci;

public class Dado extends LanciAstratti {


	
	//costruttore
	public Dado() {
		this.risultatiPossibili = 6;
	}
	
	//metodo
	public void StampaRisultato() {
		System.out.println("Dado: " + this.CalcolaRisultato());
	}
}
