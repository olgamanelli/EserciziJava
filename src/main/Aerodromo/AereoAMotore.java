package main.Aerodromo;

public class AereoAMotore extends Aeromobile {

	//attributo
	private double potenza;

	//costruttore
	public AereoAMotore(String sigla, double potenza) {
		super(sigla);
		this.potenza=potenza;
	}

	public double getPotenza() {
		return potenza;
	}

	@Override
	public boolean CMP(Aeromobile x) {
		if(!(x instanceof AereoAMotore)) {
			return false;
		} else {
			AereoAMotore aereoDaConfrontare = (AereoAMotore)x;
			return this.potenza >= aereoDaConfrontare.potenza;
		}
	}
	
	@Override
	public String toString(){
		return "Aero a motore di sigla " + this.sigla + " e potenza " + this.potenza;
	}
	
	@Override
	public boolean equals(Object x) {
		if(!(x instanceof AereoAMotore)) {
			return false;
		} else{
			AereoAMotore aereoDaConfrontare = (AereoAMotore)x;
			return this.getSigla().equals(aereoDaConfrontare.getSigla()) &&
					this.potenza==aereoDaConfrontare.potenza;
		}
	}

}
