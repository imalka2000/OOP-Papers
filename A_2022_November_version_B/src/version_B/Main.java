package version_B;

import java.util.Scanner;

public class Main
{
	
	public static void main(String[] args) {
		
		Object lock=new Object()
;
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter pattern 01:");
		String p1=sc.nextLine();
		
		System.out.print("Enter pattern 02:");
		String p2=sc.nextLine();
		
		System.out.print("Enter Count :");
		int count=sc.nextInt();
		
		
		Thread thread01=new Pattern01(lock, p1, count);
		Thread thread02=new Pattern02(lock, p2, count);
		
		thread02.start();
		thread01.start();
		
		try {
			thread01.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			thread02.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
