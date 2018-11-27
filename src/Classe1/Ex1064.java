package Classe1;

import java.util.Scanner;

public class Ex1064 {

	public static void main(String[] args) {
		
		double valores [] = new double[6];
		double media = 0;
		int cont = 0;
		
		Scanner n = new Scanner(System.in);

		for(int x=0;x<valores.length;x++)
		{
			valores[x] = n.nextDouble();
		}
		
		for(int x=0;x<valores.length;x++)
		{
			if(valores[x] > 0)
			{
				cont++;
				media += valores[x];
			}
		}
		System.out.println(cont+" valores positivos");
		System.out.printf("%.1f\n",(media/cont));
	}

}
