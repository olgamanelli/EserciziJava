package main.Aerodromo;

public class Aliante extends Aeromobile {


	public void setEfficienza(int efficienza) {
		this.efficienza = efficienza;
	}

	//attributo
	private int efficienza;

	//costruttore
	public Aliante(String sigla, int efficienza) {
		super(sigla);
		this.efficienza=efficienza;
	}


	@Override
	public boolean equals(Object x) {
		if(!(x instanceof Aliante)) {
			return false;
		} else{
			Aliante alianteDaConfrontare = (Aliante)x;
			return this.getSigla().equals(alianteDaConfrontare.getSigla()) &&
					this.efficienza==alianteDaConfrontare.efficienza;
		}
	}

	@Override
	public String toString(){
		return "Aliante di sigla " + this.sigla+ " e efficienza " + this.efficienza;
	}

	@Override
	public boolean CMP(Aeromobile x) {
		if(!(x instanceof Aliante)) {
			return false;
		} else {
			Aliante alianteDaConfrontare = (Aliante)x;
			return this.efficienza >= alianteDaConfrontare.efficienza;
		}
	}

}
