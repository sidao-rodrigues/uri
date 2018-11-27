package Classe1;

import java.util.Scanner;

public class Ex1114 {

	public static void main(String[] args) {
		
		int senha = 0;
		
		Scanner n = new Scanner(System.in);
	 
		do 
		{
			senha = n.nextInt();
			
			if(senha != 2002)
			{
				System.out.println("Senha Invalida");
			}
			else
			{
				System.out.println("Acesso Permitido");
			}
		}
		while(senha != 2002);

	}

}
