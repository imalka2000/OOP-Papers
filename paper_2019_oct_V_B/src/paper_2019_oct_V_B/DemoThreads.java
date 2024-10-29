package paper_2019_oct_V_B;


public class DemoThreads {

	public static void main(String[] args) {

		DemoThreads demoThread = new DemoThreads();

		Thread addNumbers = new Thread(new AddNumbers(demoThread, 10, 20, "Add"));
		Thread multiplyNumers = new Thread(new MultiplyNumbers(demoThread, 10, 20, "Mul"));

		multiplyNumers.start();
		addNumbers.start();
		
		
		try {
			addNumbers.join();
			multiplyNumers.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
