package main.Aerodromo;

public class TestAerodromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aliante aliante1 = new Aliante("4er67", 1000);
		Aliante aliante2 = new Aliante("747fh", 3000);
		AereoAMotore aereo1 = new AereoAMotore("45yy7", 9000);
		AereoAMotore aereo2 = new AereoAMotore("45yr7", 5000);
		
		System.out.println(aliante2.CMP(aliante1));
		
	}

}
