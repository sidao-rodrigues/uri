package Classe1;

import java.util.Scanner;

public class Ex1018 {

	public static void main(String[] args) {
		
		int valor = 0, nota100 = 0, nota50 = 0, nota20 = 0, nota10 = 0, nota5 = 0, nota2 = 0, nota1 = 0, valorTotal = 0, valorFinal = 0;
		
		Scanner n = new Scanner(System.in);
		
		do
		{
			valor = n.nextInt();
		}
		while(valor <= 0 || valor > 1000000);
			
		valorFinal = valor;
		
		nota100 = valor / 100;
		valorTotal = valor % 100;
		
		valor = valorTotal;
		
		nota50 = valor / 50;
		valorTotal = valor % 50;
		
		valor = valorTotal;
		
		nota20 = valor / 20;
		valorTotal = valor % 20;
		
		valor = valorTotal;
		
		nota10 = valor / 10;
		valorTotal = valor % 10;
		
		valor = valorTotal;
		
		nota5 = valor / 5;
		valorTotal = valor % 5;
		
		valor = valorTotal;
		
		nota2 = valor / 2;
		valorTotal = valor % 2;
		
		valor = valorTotal;
		
		nota1 = valor / 1;
		valorTotal = valor % 1;

		System.out.printf("%d\n",valorFinal);
		System.out.printf("%d nota(s) de R$ 100,00\n",nota100);
		System.out.printf("%d nota(s) de R$ 50,00\n",nota50);
		System.out.printf("%d nota(s) de R$ 20,00\n",nota20);
		System.out.printf("%d nota(s) de R$ 10,00\n",nota10);
		System.out.printf("%d nota(s) de R$ 5,00\n",nota5);
		System.out.printf("%d nota(s) de R$ 2,00\n",nota2);
		System.out.printf("%d nota(s) de R$ 1,00\n",nota1);
		
		
	}

}
