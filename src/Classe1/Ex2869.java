package Classe1;

import java.util.Scanner;

public class Ex2869 {

	public static void main(String[] args) {
		 
        int qtd = 0, valor = 0, aux = 0, cont = 0,sair = 0;
		
		Scanner n = new Scanner(System.in);
		
		qtd = n.nextInt();
		
		//esse código não está funcionando perfeitamente! apenas para teste!  
		for(int x=0;x<qtd;x++)
		{
			
			do 
			{
				valor = n.nextInt();
			}
			while(valor < 1 || valor > 100);
			
			//System.out.println("valor : "+valor % 1000000007);
			
			aux = 0;
			sair = 0;
			
			do
			{
				aux++;
				cont = 0;
				for(int y=1;y<=aux;y++)
				{
					if(aux % y == 0)
					{
						cont++;
						if(cont == valor && aux == y)
						{
							sair = 1;
						}
					}
				}
				
			}
			while(sair != 1);
			System.out.printf("%d\n",aux);
		}
 
    }

}
