package main.Collezioni;

public abstract class OperaDArte {

	//attributi
	protected String titolo;
	protected String artista;
	
	//costruttore
	public OperaDArte(String titolo, String artista) {
		this.titolo=titolo;
		this.artista=artista;
	}
	
	//metodi
	public abstract double printingombro();
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof OperaDArte)) {
			return false;
		} else {
			OperaDArte operaDaConfrontare = (OperaDArte)o;
			return this.titolo.equals(operaDaConfrontare.getTitolo()) && operaDaConfrontare.artista.equals(operaDaConfrontare.getArtista());
		}
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	};
	
	
}
