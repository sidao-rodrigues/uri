package Classe1;

import java.util.Scanner;

public class Ex1015 {

	public static void main(String[] args) {
		
		double valores[] = new double[4], distancia = 0;
		
		Scanner n = new Scanner(System.in);	
		
		for(int x=0;x<valores.length;x++)
		{
			valores[x] = n.nextDouble();
  		}
		
		distancia = Math.sqrt(Math.pow((valores[2] - valores[0]), 2) + Math.pow((valores[3] - valores[1]), 2));
		
		System.out.printf("%.4f\n",distancia);

	}

}
