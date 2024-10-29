package Q1;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Question01A {

	public static void main(String[] args) 
	{	
		String title;
		Scanner sc=new Scanner(System.in);
		
		PriorityQueue<String> pr=new PriorityQueue<String>();
		
		while(true)
		{	
			System.out.print("Enter book titles (type 'done' when finished):");
			title=sc.nextLine();
			if(title.equalsIgnoreCase("done"))
			{
				break;
			}
			pr.add(title);
		}
        
		
		
		System.out.print("\nEnter the title of the book you want to remove: ");
		String Title_remove=sc.nextLine();		
		boolean s=pr.remove(Title_remove);
		
		if(s)
		{
            System.out.println("Book '" + Title_remove + "' was successfully removed.");

		}
		else
		{
            System.out.println("Book '" + Title_remove + "' was not found.");

		}
		
		System.out.println("Total Numbers of Books:"+pr.size());
		
		
		while (!pr.isEmpty()) 
        {
            System.out.println(pr.poll());
        }
		
	}

}
