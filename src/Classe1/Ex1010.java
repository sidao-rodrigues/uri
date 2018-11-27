package Classe1;

import java.util.Scanner;

public class Ex1010 {

	public static void main(String[] args) {
		
		int raio = 0;
		
		double volume = 0;
		
		Scanner n = new Scanner(System.in);	
		
		raio = n.nextInt();
		
		volume = (4.0/3.0) * 3.14159 * (Math.pow(raio, 3));
		
		System.out.printf("VOLUME = %.3f\n",volume);
		
	}

}
