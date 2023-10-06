package main.Lanci;
import java.util.*;
public abstract class LanciAstratti {

	//attributo
	protected int risultatiPossibili;
	
	//metodo astratto
	public int CalcolaRisultato() {
		Random random = new Random();
		try{
			return random.nextInt(this.risultatiPossibili-1);
		}
		catch(IllegalArgumentException e){
			System.out.println("risultati Possibili_: " + this.risultatiPossibili);
			throw new IllegalArgumentException("Sbagliato");
		}
	}
}
