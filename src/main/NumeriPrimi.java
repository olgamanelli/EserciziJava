package main;
import java.util.Scanner;

//Calcolare i numeri primi compresi tra due numeri interi inseriti dall'utente.

public class NumeriPrimi {

	public static void main(String[] args) {

		//Richiedere i due numeri in ingresso
		Scanner in = new Scanner(System.in);
		System.out.println("Inserire due numeri interi: ");
		int a = in.nextInt();
		int b = in.nextInt();

		//fare funzione isPrimo che controlla se un numero è primo

		//scorrere tutti i numeri fra a e b e vedere quali sono primi
		System.out.println("I numeri primi fra " + a + " e " + b + " sono:");
		for(int i=a; i < b+1 ; i++) {
			if(isPrimo(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean isPrimo(int num) {

		boolean primo = true;
		if(num==1) {
			primo = false;
		} else if(num==2){
			primo=true;
		}else {
			for(int i=2; i < num-1; i++) {
				if(num%i==0) {
					primo = false;
					break;
				}
			}
		}
		return primo;
	}

}
