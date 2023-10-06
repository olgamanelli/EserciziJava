//Scrivi un programma che sia in grado di istanziare degli oggetti 'distributori di benzina' di cui sia nota la città,
//il proprietario, la capacità e la benzina attualmente contenuta nel distributore. Dell'oggetto Distributore, deve essere 
//possibile simulare le operazioni di erogazione del carburante e dei corrispondenti incassi. 
//Implementa una interfaccia Comparable, in modo da consentire il confronto tra 2 distributori in base alla capacità del serbatoio di carburante.

package main.Distributori;

public class TestDistributori {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Distributore distributore1 = new Distributore("Milano", "Carlo", 5000 , 300);
		Distributore distributore2 = new Distributore("Roma", "Mario", 5000 , 400);

		if(distributore1.compareTo(distributore2) > 0) {
			System.out.println("il distributore di " + distributore1.getCitta() + " ha più capacità del distributore di " + distributore2.getCitta());
		} else if( distributore1.compareTo(distributore2)  < 0){
			System.out.println("il distributore di " + distributore2.getCitta() + " ha più capacità del distributore di " + distributore1.getCitta());
		} else {
			System.out.println("il distributore di " + distributore2.getCitta() + " ha la stessa capacità del distributore di " + distributore1.getCitta());
		}
	}

}
