package main.Collezioni;

import java.util.List;

public class Collezione {

	//attributi
	private String nome;
	private List<OperaDArte> listaOpere;
	
	//costruttore
	public Collezione(String nome, List<OperaDArte> listaOpere) {
		this.nome = nome;
		this.listaOpere = listaOpere;
	}
	
	//metodi
	public void inserimentoOpera(OperaDArte opera){
		this.listaOpere.add(opera);
	}
	
	public void stampaCollezione() {
		listaOpere.stream().forEach(opera -> System.out.println(opera.getTitolo() + ", " + opera.getArtista()));
	}
	
	public void stampaOccupazione(OperaDArte opera) {
		if(!(this.listaOpere.contains(opera))) {
			System.out.println("L'opera " + opera.getTitolo() + " non è presente nella collezione " + this.nome);
		} else {
			System.out.println("L'occupazione dell'opera " + opera.getTitolo() + " è data da " + opera.printingombro());
		}
	}
	
}