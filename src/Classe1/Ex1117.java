package Classe1;

import java.util.Scanner;

public class Ex1117 {

	public static void main(String[] args) {
		
		int cont = 0;
		double n1 = -1.0, n2 = -1.0, total = 0.0, aux = 0.0;
		
		Scanner n = new Scanner(System.in);

		do
		{
			aux = n.nextDouble();
			
			if((aux >= 0 && aux <= 10))
			{
				if(cont == 0)
				{
					n1 = aux;
					cont++;
				}
				else
				{
					n2 = aux;
				}
			}
			else
			{
				System.out.println("nota invalida");
			}
		}
		while((n1 < 0 || n1 > 10) || (n2 < 0 ||  n2 > 10));
		
		total = (n1+n2)/2;
		System.out.printf("media = %.2f\n",total);
	}

}
