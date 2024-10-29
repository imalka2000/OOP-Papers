package Generics_2023_vB;

import java.util.ArrayList;
import java.util.Scanner;

public class Question02A 
{
	
	public static void main(String[] args)
	{
	
		ArrayList<Integer> array =new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		
		
		int num;
		
		System.out.println("Enter Numbers(0 to quit) :");
		while(true)
		{
			num=sc.nextInt();
			if(num==0)
			{
				break;
			}
			
			array.add(num);
			
		}
		
		
		for(int i=0;i<array.size();i++)
		{		
			if(array.get(i)%2==0)
			{				
				array.remove(i);
				i--;
			}
		}
		
		
		System.out.println("Odd Numbers : "+ array);
		

		
	}
	
	
	
	
	
	
	

}
