package Classe1;

import java.util.Scanner;

public class Ex1004 {

	public static void main(String[] args) {
		
		int n1 = 0, n2 = 0, prod = 0;
		
		Scanner n = new Scanner(System.in);
		
		n1 = n.nextInt();
		n2 = n.nextInt();

		prod = n1*n2;
		
		System.out.printf("PROD = %d\n",prod);

	}

}
