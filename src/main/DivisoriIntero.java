package main;
// Scrivere un programma che richiesto un numero intero visualizzi tutti i suoi divisori, contandoli.   
import java.util.Scanner;

public class DivisoriIntero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Prendere in entrata un intero n
		Scanner in = new Scanner(System.in);
		System.out.println("Inserire numero intero: ");
		int n = in.nextInt();
		
		//Scorrere tutti i numeri da 1 a n, se sono divisori stamparli e alla fine dire quanti sono
		int count = 0;
		System.out.println("I divisori di " + n + " sono: ");
		for(int i=1; i <=n; i++) {
			if(n%i==0) {
				System.out.println(i);
				count++;
			}
		}
		
		System.out.println("In totale i divisori sono: " + count);
		in.close();
	}

}
