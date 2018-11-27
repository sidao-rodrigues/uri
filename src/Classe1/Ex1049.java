package Classe1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1049 {

	public static void main(String[] args) {
		
		
		ArrayList<String> nomes = new ArrayList<String>();
		
		Scanner n = new Scanner(System.in);
		
		for(int x=0;x<3;x++)
		{
			nomes.add(n.nextLine());
		}
		
		if(nomes.get(0).equalsIgnoreCase("vertebrado"))
		{
			if(nomes.get(1).equalsIgnoreCase("ave"))
			{
				if(nomes.get(2).equalsIgnoreCase("carnivoro")) 
				{
					System.out.println("aguia");
				}
				else if(nomes.get(2).equalsIgnoreCase("onivoro")) 
				{
					System.out.println("pomba");
				}
			}
			else if(nomes.get(1).equalsIgnoreCase("mamifero"))
			{
				if(nomes.get(2).equalsIgnoreCase("herbivoro")) 
				{
					System.out.println("vaca");
				}
				else if(nomes.get(2).equalsIgnoreCase("onivoro")) 
				{
					System.out.println("homem");
				}
			}
			
		}
		else if(nomes.get(0).equalsIgnoreCase("invertebrado"))
		{
			if(nomes.get(1).equalsIgnoreCase("inseto"))
			{
				if(nomes.get(2).equalsIgnoreCase("hematofago")) 
				{
					System.out.println("pulga");
				}
				else if(nomes.get(2).equalsIgnoreCase("herbivoro")) 
				{
					System.out.println("lagarta");
				}
			}
			else if(nomes.get(1).equalsIgnoreCase("anelideo"))
			{
				if(nomes.get(2).equalsIgnoreCase("hematofago")) 
				{
					System.out.println("sanguessuga");
				}
				else if(nomes.get(2).equalsIgnoreCase("onivoro")) 
				{
					System.out.println("minhoca");
				}
			}
			
		}
		
		
	}

}
