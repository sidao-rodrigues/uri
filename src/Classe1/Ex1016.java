package Classe1;

import java.util.Scanner;

public class Ex1016 {

	public static void main(String[] args) {
		
		int km = 0, minutos = 0;
		
		Scanner n = new Scanner(System.in);	

		km = n.nextInt();
		
		minutos = (km * 60) / 30;
		
		System.out.printf("%d minutos\n",minutos);
		
	}

}
