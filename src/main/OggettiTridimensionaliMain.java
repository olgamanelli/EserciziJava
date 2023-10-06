package main;
import main.OggettiTridimensionali;
// Calcolo aree cilindri e paralelepipedi
public class OggettiTridimensionaliMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cilindro cilindro = new Cilindro(9.4,3.1);
		Parallelepipedo parallelepipedo = new Parallelepipedo(10.1,4);
		
		cilindro.stampaVolume();
		parallelepipedo.stampaVolume();
		
	}

}
