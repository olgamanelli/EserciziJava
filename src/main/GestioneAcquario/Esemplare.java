package main.GestioneAcquario;

public abstract class Esemplare {

	//Attributi
	private String identificativo;
	private int eta;
	
	//costruttore
	public Esemplare(String identificativo, int eta) {
		this.identificativo=identificativo;
		this.eta=eta;
	}

	public String getIdentificativo() {
		return identificativo;
	}

	public void setIdentificativo(String identificativo) {
		this.identificativo = identificativo;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}
	
	
	
}
