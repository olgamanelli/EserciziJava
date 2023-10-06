package main.GestioneAcquario;

public class Mammifero extends Esemplare{

	//attributo
	private final int gestazione;
	
	//costruttore
	public Mammifero(String identificativo, int eta, int gestazione) {
		super(identificativo,eta);
		this.gestazione=gestazione;
	}
	
	
}
