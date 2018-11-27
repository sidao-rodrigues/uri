package Classe1;

import java.util.Scanner;

public class Ex1005 {

	public static void main(String[] args) {
		
		double n1 = 0, n2 = 0, media = 0;
		
		Scanner n = new Scanner(System.in);
		
		do 
		{
			n1 = n.nextDouble();
		}
		while(n1 < 0 || n1 > 10);
		
		do 
		{	
			n2 = n.nextDouble();
		}
		while(n2 < 0 || n2 > 10);
		
		media = ((n1*3.5) +(n2*7.5))/11;
		
		System.out.printf("MEDIA = %.5f\n",media);

	}

}
