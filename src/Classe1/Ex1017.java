package Classe1;

import java.util.Scanner;

public class Ex1017 {

	public static void main(String[] args) {
		
		int kmH = 0, horas = 0;
		double litros = 0;
		
		Scanner n = new Scanner(System.in);	

		horas = n.nextInt();
		kmH = n.nextInt();
		
		litros = (horas * kmH) / 12.0;
		
		System.out.printf("%.3f\n",litros);

	}

}
