package Classe1;

import java.util.Scanner;

public class Ex1078 {

	public static void main(String[] args) {
		
		int num = 0;
		
		Scanner n = new Scanner(System.in);	

		do {
			num = n.nextInt();
		}while(num < 2 || num > 1000);
		
		for(int x=1;x<=10;x++)
		{
			System.out.println(x+" x "+num+" = "+(x*num));
		}
	}

}
