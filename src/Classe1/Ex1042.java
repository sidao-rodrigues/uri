package Classe1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex1042 {

	public static void main(String[] args) {
		
		String valores = "", numsSplit [];	
		ArrayList<Integer> valoresInteiro = new ArrayList();
		int cont=0;
		
		Scanner n = new Scanner(System.in);
		
		valores = n.nextLine();
		numsSplit = valores.split(" ");
		
		for(int x=0;x<numsSplit.length;x++)
		{
			valoresInteiro.add(Integer.parseInt(numsSplit[x]));
		}
		Collections.sort(valoresInteiro);
		
		for(int x=0;x<valoresInteiro.size();x++)
		{	
			if(x < 2  && cont == 0)
			{
				System.out.println(valoresInteiro.get(x));
			}
			else if (x == 2 && cont == 0)
			{
				cont++;
				System.out.println(valoresInteiro.get(x));
				System.out.println("");
				x=-1;
			}
			else if(x < 3 && cont == 1)
			{
				System.out.println(numsSplit[x]);
			}
		}
		
		
	}

}
