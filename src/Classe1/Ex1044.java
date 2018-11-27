package Classe1;

import java.util.Scanner;

public class Ex1044 {

	public static void main(String[] args) {
		
		String valores = "", nums[];
		int x=0,y=0;
		
		Scanner n = new Scanner(System.in);
		
		valores = n.nextLine();
		nums = valores.split(" ");
		
		x = Integer.parseInt(nums[0]);
		y = Integer.parseInt(nums[1]);
 		
		if(x > y)
		{
			if(x % y == 0)
			{
				System.out.println("Sao Multiplos");
			}
			else 
			{
				System.out.println("Nao sao Multiplos");
			}
		}
		else
		{
			if(y % x == 0)
			{
				System.out.println("Sao Multiplos");
			}
			else 
			{
				System.out.println("Nao sao Multiplos");
			}
		}

	}

}
