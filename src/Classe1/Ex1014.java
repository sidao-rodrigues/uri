package Classe1;

import java.util.Scanner;

public class Ex1014 {

	public static void main(String[] args) {
		
		int km = 0;
		double valor = 0, totalKmPL = 0;
		
		Scanner n = new Scanner(System.in);	
		
		km = n.nextInt();
		valor = n.nextDouble();
				
		totalKmPL = km / valor;
		
		System.out.printf("%.3f km/l\n",totalKmPL);
	}

}
