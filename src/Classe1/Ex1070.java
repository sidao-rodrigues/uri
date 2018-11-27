package Classe1;

import java.util.Scanner;

public class Ex1070 {

	public static void main(String[] args) {
		
		int numero = 0, cont = 0;
		
		Scanner n = new Scanner(System.in);	
		
		numero = n.nextInt();
		
		while(cont != 6)
		{
			if(numero % 2 != 0)
			{
				System.out.println(numero);
				cont++;
			}
			numero++;
		}
	}

}
