package Classe1;

import java.util.Scanner;

public class Ex1067 {

	public static void main(String[] args) {
		
		int numero = 0;
		
		Scanner n = new Scanner(System.in);	
		
		do 
		{
			numero = n.nextInt();
			if(numero >= 1 && numero <= 1000)
			{
				for(int x=1;x<=numero;x++)
				{
					if(x % 2 != 0)
					{
						System.out.println(x);
					}
				}
			}
		}while(numero < 1  || numero > 1000);

	}

}
