package Classe1;

import java.util.Scanner;

public class Ex1048 {

	public static void main(String[] args) {
		
		double salario = 0.00;
		
		Scanner n = new Scanner(System.in);

		salario = n.nextDouble();
		
		if(salario >= 0.00 && salario <= 400.00)
		{
			System.out.printf("Novo salario: %.2f\n",(salario +(salario * 0.15)));
			System.out.printf("Reajuste ganho: %.2f\n",(salario * 0.15));
			System.out.println("Em percentual: 15 %");
			
		}
		else if(salario >= 400.01 && salario <= 800.00)
		{
			System.out.printf("Novo salario: %.2f\n",(salario +(salario * 0.12)));
			System.out.printf("Reajuste ganho: %.2f\n",(salario * 0.12));
			System.out.println("Em percentual: 12 %");
		}
		else if(salario >= 800.01 && salario <= 1200.00)
		{
			System.out.printf("Novo salario: %.2f\n",(salario +(salario * 0.10)));
			System.out.printf("Reajuste ganho: %.2f\n",(salario * 0.10));
			System.out.println("Em percentual: 10 %");
		}
		else if(salario >= 1200.01 && salario <= 2000.00)
		{
			System.out.printf("Novo salario: %.2f\n",(salario +(salario * 0.07)));
			System.out.printf("Reajuste ganho: %.2f\n",(salario * 0.07));
			System.out.println("Em percentual: 7 %");
		}
		else if(salario > 2000.01)
		{
			System.out.printf("Novo salario: %.2f\n",(salario +(salario * 0.04)));
			System.out.printf("Reajuste ganho: %.2f\n",(salario * 0.04));
			System.out.println("Em percentual: 4 %");
		}
		
		
	}

}
