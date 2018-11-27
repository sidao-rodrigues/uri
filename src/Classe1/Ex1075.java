package Classe1;

import java.util.Scanner;

public class Ex1075 {

	public static void main(String[] args) {
		
		int num = 0;
		
		Scanner n = new Scanner(System.in);	
		
		num = n.nextInt();

		for(int x=1;x<=10000;x++)
		{
			if(x % num == 2)
			{
				System.out.printf("%d\n",x);
			}
		}
		
	}

}
