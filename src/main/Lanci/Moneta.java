package main.Lanci;

public class Moneta extends LanciAstratti{
	
	
	//costruttore
	public Moneta() {
		this.risultatiPossibili = 2;
	}

	//costruttore
	public void StampaRisultato(){
		if(this.CalcolaRisultato()==0) {
			System.out.println("Moneta: Testa");
		} else {
			System.out.println("Moneta: Croce");
		}
	}
	
}
