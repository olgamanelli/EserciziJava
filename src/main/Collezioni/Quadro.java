package main.Collezioni;

public class Quadro extends OperaDArte{

	//attributi
	private double altezza;
	private double larghezza;
	
	//costruttore
	public Quadro(String titolo, String artista, double altezza, double larghezza) {
		super(titolo,artista);
		this.altezza=altezza;
		this.larghezza=larghezza;
	}
	
	//metodi
	
	@Override
	public double printingombro() {
		return this.altezza*this.larghezza;
	}

	
}
