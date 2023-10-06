package main;

import java.util.List;

import main.GestioneAcquario.Esemplare;
import main.GestioneAcquario.Vasca;

public class Acquario {

	//attributo
	private List<Vasca> listaVasche; 
	
	//costruttore
	public Acquario(List<Vasca> listaVasche) {
		this.listaVasche=listaVasche;
	}
	
	//metodi
	public void stampaEsemplari() {
		this.listaVasche.stream().forEach(vasca -> vasca.stampaEsemplari());
	}
	

}
