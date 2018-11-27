package Classe1;

import java.util.Scanner;

public class Ex1065 {

	public static void main(String[] args) {
		
		int valores [] = new int[5], cont =0;
		
		Scanner n = new Scanner(System.in);

		for(int x=0;x<valores.length;x++)
		{
			valores[x] = n.nextInt();
		}
		for(int x=0;x<valores.length;x++)
		{
			if(valores[x] % 2 == 0)
			{
				cont++;
			}
		}
		System.out.println(cont+" valores pares");
		
	}

}
