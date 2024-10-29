package Paper2022;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		
		Object lock=new Object();
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter pattern 01 =");
		String p1=sc.next();
		
		System.out.print("Enter pattern 02 =");
		String p2=sc.next();
		
		System.out.print("Enter Count      =");
		int ct=sc.nextInt();
		
		
		Thread th1=new Pattern01(lock,p1,ct);
		Thread th2=new Pattern02(lock,p2,ct);
		
		th1.start();
		th2.start();
		
	
		
		
		
	}
	
}
