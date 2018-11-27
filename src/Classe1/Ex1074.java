package Classe1;

import java.util.Scanner;

public class Ex1074 {

	public static void main(String[] args) {
		
		int num = 0;
		
		Scanner n = new Scanner(System.in);	
		
		num = n.nextInt();

		int valores[] = new int[num];
		
		for(int x=0;x<valores.length;x++)
		{
			valores[x] = n.nextInt();
		}
		for(int x=0;x<valores.length;x++)
		{
			if(valores[x] == 0  || valores[x] == -0)
			{
				System.out.println("NULL");
			}
			else if(valores[x] > 0)
			{
				if(valores[x] % 2 == 0)
				{
					System.out.println("EVEN POSITIVE");
				}
				else
				{
					System.out.println("ODD POSITIVE");
				}
			}
			else if(valores[x] < 0)
			{
				if(valores[x] % 2 == 0)
				{
					System.out.println("EVEN NEGATIVE");
				}
				else
				{
					System.out.println("ODD NEGATIVE");
				}
			}
			
		}
			
	}

}
