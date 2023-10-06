package main.Aerodromo;

public abstract class Aeromobile implements CMP {

	//attributo
	protected String sigla;
	
	//costruttore
	public Aeromobile(String sigla) {
		this.sigla=sigla;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String toString(Object x) {
		return null;
	}
	


//	@Override
//	public boolean equals(Object x) {
//		if(x instanceof Aeromobile) {
//			
//		}
//		return false;
//	}

	
}
