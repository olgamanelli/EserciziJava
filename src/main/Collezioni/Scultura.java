package main.Collezioni;

public class Scultura extends OperaDArte{
	//attributi
	private double altezza;
	private double larghezza;
	private double profondita;

	//costruttore
	public Scultura(String titolo, String artista, double altezza, 
			double larghezza, double profondita) {
		super(titolo,artista);
		this.altezza=altezza;
		this.larghezza=larghezza;
		this.profondita=profondita;
	}

	//metodi

	@Override
	public double printingombro() {
		return this.altezza*this.larghezza*this.profondita;
	}


}
