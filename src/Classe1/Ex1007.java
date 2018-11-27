package Classe1;

import java.util.Scanner;

public class Ex1007 {

	public static void main(String[] args) {
		
		int valores [] = new int[4], produto = 0;
		
		Scanner n = new Scanner(System.in);
		
		for(int x=0;x<valores.length;x++)
		{
			valores[x] = n.nextInt();
		}
		
		produto = (valores[0] * valores[1]) - (valores[2] * valores[3]);
		
		System.out.printf("DIFERENCA = %d\n",produto);

	}

}
