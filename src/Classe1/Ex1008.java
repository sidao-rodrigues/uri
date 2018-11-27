package Classe1;

import java.util.Scanner;

public class Ex1008 {

	public static void main(String[] args) {
		
		int id = 0, horasTblhd = 0;
		double valorHoraTblhd = 0, salario = 0;

		Scanner n = new Scanner(System.in);

		id = n.nextInt();
		horasTblhd = n.nextInt();
		valorHoraTblhd = n.nextDouble();
		
		salario = (horasTblhd * valorHoraTblhd);
		
		System.out.printf("NUMBER = %d\n",id);
		System.out.printf("SALARY = U$ %.2f\n",salario);
	}

}
