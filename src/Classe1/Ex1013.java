package Classe1;

import java.util.Scanner;

public class Ex1013 {

	public static void main(String[] args) {
		
		int valores[] = new int[3], maior = 0;
		
		Scanner n = new Scanner(System.in);	

		for(int x=0;x<valores.length;x++)
		{
			valores[x] = n.nextInt();
		}
		
		maior = (valores[0] + valores[1] + Math.abs(valores[0] - valores[1]))/2;
		maior = (maior + valores[2] + Math.abs(maior - valores[2]))/2;
		
		System.out.printf("%d eh o maior\n",maior);
	}

}
