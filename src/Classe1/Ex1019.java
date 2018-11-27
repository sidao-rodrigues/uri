package Classe1;

import java.util.Scanner;

public class Ex1019 {

	public static void main(String[] args) {
		
		int numero = 0, horas = 0, minutos = 0, segundos = 0;
		
		Scanner n = new Scanner(System.in);
		
		numero = n.nextInt();
		
		
		horas = numero / 3600;
		minutos = (numero - (horas * 3600)) / 60;
		segundos = numero - (horas * 3600) - (minutos * 60);
		
		System.out.printf("%d:%d:%d\n",horas,minutos,segundos);
		
	}

}
