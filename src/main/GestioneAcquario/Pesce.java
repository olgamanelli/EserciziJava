package main.GestioneAcquario;

public class Pesce extends Esemplare {

	//attributi
	private int profondita;
	
	//costruttore
	public Pesce(String identificativo, int eta, int profondita) {
		super(identificativo,eta);
		this.profondita=profondita;
	}
}
