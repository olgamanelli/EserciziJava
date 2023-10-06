package main;
//Scrivere un programma che dato un numero, restituisca il suo fattoriale.
import java.util.*;


public class Fattoriale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Leggere numero
		Scanner in = new Scanner(System.in);
		System.out.println("Inserire un numero positivo: ");
		int num = in.nextInt();

		//Calcolare fattoriale con funzione ricorsiva
		if(num < 0) {
			System.out.println("Errore: inserire numero positivo!");
		} else {
			System.out.println("Il fattoriale di " + num + " è " + CalcolaFattoriale(num) );
		}
		
		in.close();
	}

	//funzione che calcola fattoriale del parametro in ingresso
	public static int CalcolaFattoriale(int num) {
		if(num == 0) {
			return 1;
		} else if(num == 1) {
			return 1;
		} else {
			return CalcolaFattoriale(num-1)*num;
		}
	}
	

}
