package Classe1;

import java.util.Scanner;

public class Ex1012 {

	public static void main(String[] args) {
		
		double valores [] = new double[3];
		double results [] = new double[5];
		
		Scanner n = new Scanner(System.in);	
		
		for(int x=0;x<valores.length;x++)
		{
			valores[x] = n.nextDouble();
		}
		
		results[0] = (valores[0] * valores[2])/2;
		results[1] = 3.14159 * (Math.pow(valores[2],2));
		results[2] = ((valores[0] + valores[1]) / 2) * valores[2];
		results[3] = Math.pow(valores[1],2);
		results[4] = valores[0] * valores[1];
		
		System.out.printf("TRIANGULO: %.3f\n",results[0]);
		System.out.printf("CIRCULO: %.3f\n",results[1]);
		System.out.printf("TRAPEZIO: %.3f\n",results[2]);
		System.out.printf("QUADRADO: %.3f\n",results[3]);
		System.out.printf("RETANGULO: %.3f\n",results[4]);
		

	}

}
