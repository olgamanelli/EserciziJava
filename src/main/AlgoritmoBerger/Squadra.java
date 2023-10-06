package main.AlgoritmoBerger;

public class Squadra {

	private String nome;
	private boolean isPlaying;
	
	
	public Squadra(String nome, boolean isPlaying) {
		super();
		this.nome = nome;
		this.isPlaying = isPlaying;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public boolean isPlaying() {
		return isPlaying;
	}


	public void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}
	
		
	
	
}
