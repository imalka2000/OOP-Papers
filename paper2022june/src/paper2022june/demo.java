package paper2022june;

import java.util.Scanner;


public class demo 
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
		
		
		Thread th1=new p1(lock,p1,ct);
		Thread th2=new p2(lock,p2,ct);
		
		th2.start();
		th1.start();
		
		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		
		
	}
	
}