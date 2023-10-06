package main.Distributori;

public class Distributore implements Comparable<Distributore> {

	//Attributi
	private String citta;
	private String proprietario;
	private int capacita;
	private int benzinaDisponibile;
	
	
	//Costruttore
	public Distributore(String citta, String proprietario, int capacita, int benzinaDisponibile) {
		this.citta=citta;
		this.proprietario=proprietario;
		this.capacita=capacita;
		this.benzinaDisponibile=benzinaDisponibile;
	}
	
	//Metodi
	
	public void erogazioneBenzina(int benzinaErogata) {
		this.benzinaDisponibile = this.benzinaDisponibile - benzinaErogata;
	}
	
	public void incassoBenzina(int benzinaIncassata) {
		this.benzinaDisponibile = this.benzinaDisponibile + benzinaIncassata;
	}
	
	
	public int getCapacita() {
		return capacita;
	}
	
	
	public String getCitta() {
		return citta;
	}

	@Override
	public int compareTo(Distributore altroDistributore) {
		return this.capacita - altroDistributore.getCapacita();
	}
	
}
