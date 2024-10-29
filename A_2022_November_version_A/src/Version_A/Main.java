package Version_A;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Object lock=new Object();//synchonization lock
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter pattern 01:");
		String p1=sc.nextLine();
		
		System.out.print("Enter pattern 02:");
		String p2=sc.nextLine();
		
		System.out.print("Enter Count :");
		int count=sc.nextInt();
		

		Thread thread01=new Pattern01(lock, count, p1);
		Thread thread02=new Pattern02(lock, count, p2);
		
		thread02.start();
		thread01.start();
		

		try {
			thread01.join();
			thread02.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
