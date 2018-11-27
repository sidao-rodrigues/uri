package Classe1;

import java.util.Scanner;

public class Ex1079 {

	public static void main(String[] args) {
		
		int num = 0;
		
		Scanner n = new Scanner(System.in);	
		
		num = n.nextInt();
		
		float valores[][] = new float[num][4];
		
		for(int x=0;x<num;x++)
		{
			for(int y=0;y<3;y++)
			{
				valores[x][y] = n.nextFloat();
			}
		}
		for(int x=0;x<num;x++)
		{
			for(int y=0;y<4;y++)
			{
				if(y != 3)
				{
					if(y == 0)
					{
						valores[x][3] += valores[x][y]*2;
					}
					else if(y == 1)
					{
						valores[x][3] += valores[x][y]*3;
					}
					else
					{
						valores[x][3] += valores[x][y]*5;
					}
				}
			}
		}
		for(int x=0;x<num;x++)
		{
			System.out.printf("%.1f\n",(valores[x][3]/10));
		}
	}

}
