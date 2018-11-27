package Classe1;

import java.util.Scanner;

public class Ex1072 {

	public static void main(String[] args) {
		
		
		int num = 0, contIn = 0, contOut = 0;
		
		Scanner n = new Scanner(System.in);	

		num = n.nextInt();
		
		int valores[] = new int[num];
		
		for(int x=0;x<valores.length;x++)
		{
			valores[x] = n.nextInt();
		}
		for(int x=0;x<valores.length;x++)
		{
			if(valores[x] >= 10 && valores[x] <= 20)
			{
				contIn++;
			}
			else
			{
				contOut++;
			}
		}
		System.out.println(contIn+" in");
		System.out.println(contOut+" out");

	}

}
