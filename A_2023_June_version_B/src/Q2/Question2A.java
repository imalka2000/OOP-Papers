package Q2;

import java.util.ArrayList;
import java.util.Scanner;

public class Question2A 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		Scanner sc=new Scanner(System.in);
		
		int num;
		System.out.println("Enter Numbers (0 to Quit):");

		while(true)
		{
			num=sc.nextInt();
			if(num==0)
			{
				break;
			}
			arr.add(num);
		}
		
		
		for(int i=0;i<arr.size();i++)
		{
			
			if(arr.get(i)%2==0)
			{
				arr.remove(i);
				i--;
			}
		}
		
		System.out.println("Odd Numbers :"+arr);
	}
	

}
