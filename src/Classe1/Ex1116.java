package Classe1;

import java.util.Scanner;

public class Ex1116 {

	public static void main(String[] args) {
		
		//String valoresNum = "", nums[];
		int qtdEntada = 0;
		double total = 0.0;
		
		Scanner n = new Scanner(System.in);
		
		qtdEntada = n.nextInt();
		
		double valores[][] = new double[qtdEntada][2];
		
		for(int i=0;i<qtdEntada;i++)
		{
			//valoresNum = n.next();
			//nums = valoresNum.split(" ");
			valores[i][0] = Double.parseDouble(n.next());//nums[0]);
			valores[i][1] = Double.parseDouble(n.next());//nums[1]);
			
			//valoresNum = "";
			//nums = null;
		}
		
		for(int i=0;i<qtdEntada;i++)
		{
			if(valores[i][0] == 0 && valores[i][1] == 0 || valores[i][1] == 0)
			{
				System.out.println("divisao impossivel");
			}
			else if(valores[i][0] == 0)
			{
				total = valores[i][0]/valores[i][1];
				System.out.printf("%.1f\n",total);
			}
			else
			{
				total = valores[i][0]/valores[i][1];
				System.out.printf("%.1f\n",total);
			}
		}

	}
	
	
}
