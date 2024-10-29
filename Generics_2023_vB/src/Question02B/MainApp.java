package Question02B;

public class MainApp 
{
	
	public static void main(String[] args) 
	{
		Pair<String,Integer> pair1=new Pair<String, Integer>("Test 01", 42);
		Pair<Double,String>  pair2=new Pair<Double,String>(3.14, "Test 02");

			
		System.out.println("Printing First Pair");
		System.out.println("First Value :"+pair1.getFirst());
		System.out.println("Second Value :"+pair1.getSecond());

		System.out.println();
		
		System.out.println("Printing Second Pair");
		System.out.println("First Value :"+pair2.getFirst());
		System.out.println("Second Value :"+pair2.getSecond());
		
	}

}
