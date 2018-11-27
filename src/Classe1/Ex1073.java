package Classe1;

import java.util.Scanner;

public class Ex1073 {

	public static void main(String[] args) {
		
		int num = 0,elevado = 0;
		
		Scanner n = new Scanner(System.in);	
		
		num = n.nextInt();
		
		for(int x=1;x<=num;x++)
		{
			if(x % 2 == 0)
			{
				elevado = (int) Math.pow(x,2);				
				System.out.println(x+"^2 = "+elevado);
			}
		}

	}

}
