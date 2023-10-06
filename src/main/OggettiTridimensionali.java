package main;

public abstract class OggettiTridimensionali {

	//attributi
	private double altezza;
	private double areaDiBase;
	
	//costruttore
	public OggettiTridimensionali(double altezza, double area) {
		this.altezza=altezza;
		this.areaDiBase=area;
	}
	
	//metodi
	public double calcoloVolume() {
		return this.altezza*this.areaDiBase;
	}
	
	public void stampaVolume() {
		System.out.println("Il volume è: " + this.calcoloVolume());
	}
}
