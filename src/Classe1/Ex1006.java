package Classe1;

import java.util.Scanner;

public class Ex1006 {

	public static void main(String[] args) {
		
		double n1 = 0, n2 = 0, n3 = 0, media = 0;
		
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
		
		do 
		{	
			n3 = n.nextDouble();
		}
		while(n3 < 0 || n3 > 10);
		
		media = ((n1*2.0) + (n2*3.0) + (n3*5.0))/10;
		
		System.out.printf("MEDIA = %.1f\n",media);

	}

}
