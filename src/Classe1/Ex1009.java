package Classe1;

import java.util.Scanner;

public class Ex1009 {

	public static void main(String[] args) {
		
		int id1 = 0, id2 = 0, qtdId1 = 0, qtdId2 = 0;
		double valorId1 = 0, valorId2 = 0, total = 0;

		Scanner n = new Scanner(System.in);

		id1 = n.nextInt();
		qtdId1 = n.nextInt();
		valorId1 = n.nextDouble();
		
		id2 = n.nextInt();
		qtdId2 = n.nextInt();
		valorId2 = n.nextDouble();
		
		total = (qtdId1 * valorId1) + (qtdId2 * valorId2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);

	}

}
