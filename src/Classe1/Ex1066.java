package Classe1;

import java.util.Scanner;

public class Ex1066 {

	public static void main(String[] args) {
		
		int valores [] = new int[5];
		int contPar = 0, contImp = 0, contPos = 0, contNeg = 0;
		
		Scanner n = new Scanner(System.in);

		for(int x=0;x<valores.length;x++)
		{
			valores[x] = n.nextInt();
		}
		for(int x=0;x<valores.length;x++)
		{
			if(valores[x] % 2 == 0)
			{
				contPar++;
				if(valores[x] > 0)
				{
					contPos++;
				}
				else if(valores[x] < 0)
				{
					contNeg++;
				}
			}
			else
			{
				contImp++;
				if(valores[x] > 0)
				{
					contPos++;
				}
				else if(valores[x] < 0)
				{
					contNeg++;
				}
			}
		}
		System.out.println(contPar+" valor(es) par(es)");
		System.out.println(contImp+" valor(es) impar(es)");
		System.out.println(contPos+" valor(es) positivo(s)");
		System.out.println(contNeg+" valor(es) negativo(s)");

	}

}
