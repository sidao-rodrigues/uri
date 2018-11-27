package Classe1;

import java.util.Scanner;

public class Ex1002 {

	public static void main(String[] args) {
		
		double raio = 0;//  3.14159; 
		double area = 0;// pi = 3.14159;
		
		Scanner n = new Scanner(System.in);

		raio = n.nextDouble();
		
		area = 3.14159 * (raio * raio);
		
		System.out.printf("A=%.4f\n",area);
		
	}

}
