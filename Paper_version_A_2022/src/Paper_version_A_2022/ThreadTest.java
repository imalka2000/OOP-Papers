package Paper_version_A_2022;

import java.util.ArrayList;

public class ThreadTest 
{
	
	public static void main(String[] args) {
		
		ArrayList<Integer> 	queue = new ArrayList<>();
		
		Thread producer = new Thread(new ProducerThread(queue));
		Thread consumer = new Thread(new ConsumerThread(queue));
		
		System.out.println("Starting	");
		
		producer.start();
		consumer.start();
		
	
		
		
	}

}
