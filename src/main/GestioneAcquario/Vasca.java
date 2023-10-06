package main.GestioneAcquario;

import java.util.ArrayList;
import java.util.List;

public class Vasca {

	//attributo
	private String nome;
	private List<Esemplare> listaEsemplari = new ArrayList<>();

	//costruttore
	public Vasca(String nome, List<Esemplare> listaEsemplari) {
		this.nome=nome;
		this.listaEsemplari=listaEsemplari;
	}

	//metodi
	public void inserisciEsemplare(Esemplare esemplare) {
		this.listaEsemplari.add(esemplare);
	}

	public void stampaEsemplari() {
		listaEsemplari.stream().forEach(esemplare -> {
			System.out.println(esemplare.getIdentificativo() + " " +   esemplare.getClass().toString());
		});
	}
	
	public void eliminaEsemplare(Esemplare esemplare) {
		if(!(this.listaEsemplari.contains(esemplare))) {
			System.out.println("La vasca non contiene tale esemplare");
		} else {
			this.listaEsemplari.remove(esemplare);
		}
	}
}
