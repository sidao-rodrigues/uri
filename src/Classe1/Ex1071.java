package Classe1;

import java.util.Scanner;

public class Ex1071 {

	public static void main(String[] args) {
		
		int n1 = 0, n2 = 0, soma = 0;
		
		Scanner n = new Scanner(System.in);	

		n1 = n.nextInt();
		n2 = n.nextInt();
		
		if(n1 > n2)
		{
			for(int x=n2+1;x<n1;x++)
			{
				if(x % 2 != 0)
				{
					soma += x;
				}
			}
		}
		else
		{
			for(int x=n1+1;x<n2;x++)
			{
				if(x % 2 != 0)
				{
					soma += x;
				}
			}
		}
		System.out.println(soma);
		
	}

}
