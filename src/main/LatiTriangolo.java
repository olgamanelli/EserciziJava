package main;
import java.util.*;
//Scrivere un programma che inseriti i lati di un ipotetico triangolo, dica se tale triangolo esiste.(un triangolo è fattibile se ogni lato è minore della somma degli altri due)

public class LatiTriangolo {

	public static void main(String[] args) {
		
		//Inserire 3 lati
		Scanner in = new Scanner(System.in);
		int lato1, lato2, lato3;
		
		System.out.println("Inserire lato 1: ");
		lato1 = in.nextInt();
		System.out.println("Inserire lato 2: ");
		lato2 = in.nextInt();
		System.out.println("Inserire lato 3: ");
		lato3 = in.nextInt();
		
		//se i lati sono negativi restituice errore, altrimenti dice se possono creare un triangolo
		if(lato1 < 0 || lato2 < 0 || lato3 < 0 ) {
			System.out.println("Errore: inserire lati positivi!");
		} else if( (lato1 < lato2 + lato3) && (lato2 < lato1+lato3) && (lato3 < lato1 +lato2)) {
			System.out.println("Questi lati possono formare un triangolo");
		} else {
			System.out.println("Questi lati NON possono formare un triangolo");
		}
		
		in.close();
	}
}
