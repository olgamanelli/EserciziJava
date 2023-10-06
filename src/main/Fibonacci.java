package main;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {

		//Leggere numero in ingresso

		Scanner in = new Scanner(System.in);
		System.out.println("Inserire numero > 0:");
		int num = in.nextInt();

		if(num < 1) {
			System.out.println("Inserire un numero > 1.");
		}else {
			//Stampare sequenza di Fibonacci
			System.out.println("La serie di Fibonacci fino al termine " + num + " è: ");
			for(int i=1; i<num+1 ; i++) {
				System.out.print(CalcolaFibonacciRicorsivo(i) + " ");
			}
		}
		
		in.close();
	}

	public static int CalcolaFibonacciRicorsivo(int num) {

		if(num==1) {
			return 1;
		} else if(num==2) {
			return 1;
		} else {
			return CalcolaFibonacciRicorsivo(num-1)+CalcolaFibonacciRicorsivo(num-2);
		}

	}
}
