package Classe1;

import java.util.Scanner;

public class EX1041 {

	public static void main(String[] args) {

		//String valor, nums[];
		//double xy [] = new double[2];
		
		

		//valor = n.nextLine();
		//nums = valor.split(" ");		
	
		//for(int i=0;i<nums.length;i++)
		//{
			//xy[i] = Double.parseDouble(nums[i]);
		//}
		/*
		if(xy[0] == 0 && xy[1] == 0)
		{
			System.out.println("Origem");
		}
		else if(xy[0] == 0)
		{
			System.out.println("Eixo X");
		}
		else if(xy[1] == 0)
		{
			System.out.println("Eixo Y");
		}
		else if(xy[0] > 0 && xy[1] > 0)
		{
			System.out.println("Q1");
		}
		else if(xy[0] > 0 && xy[1] < 0)
		{
			System.out.println("Q4");
		}
		else if(xy[0] < 0 && xy[1] > 0)
		{
			System.out.println("Q2");
		}
		else if(xy[0] < 0 && xy[1] < 0)
		{
			System.out.println("Q3");
		}*/
		
		Scanner n = new Scanner(System.in);
		
		float x, y;
		
		x = n.nextFloat();
		y = n.nextFloat();
		
		if(x == 0 && y == 0){
		   System.out.printf("Origem\n");
		}else if(x == 0){
		   System.out.printf("Eixo Y\n");
		}else if(y == 0){
		   System.out.printf("Eixo X\n");
		}else if(x > 0 && y > 0){
		   System.out.printf("Q1\n");
		}else if(x > 0 && y < 0){
		   System.out.printf("Q4\n");
		}else if(x < 0 && y > 0){
		   System.out.printf("Q2\n");
		}else{
		   System.out.printf("Q3\n");
		}
	}

}
