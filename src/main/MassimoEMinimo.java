package main;
import java.util.*;
//Inserire una serie di numeri interi positivi da tastiera ed individuare il massimo e il minimo; la serie in ingresso deve essere terminata dal numero 0.    

public class MassimoEMinimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Leggere numeri interi in ingresso finchè non si legge lo 0 e salvarli in una lista
		Scanner in = new Scanner(System.in);
		List<Integer> listaNumeri= new ArrayList<>();
		int num;
		do {
			System.out.println("Inserire un numero intero: ");
			num = in.nextInt();
			listaNumeri.add(num);
		} while(num != 0);

		//Individuare max e min
		int min = listaNumeri.get(0);
		int max = listaNumeri.get(0);

		for(int i=1; i < listaNumeri.size(); i++) {

			if(listaNumeri.get(i) < min) {
				min=listaNumeri.get(i);
			}

			if(listaNumeri.get(i) > max) {
				max=listaNumeri.get(i);
			}

		}
		
		
		//Stampare massimo e minimo
		System.out.println("Il massimo è: " + max);
		System.out.println("Il minimo è: " + min);
	}

}
