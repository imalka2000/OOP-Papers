package Q2_B;

public class MainApp {

	public static void main(String[] args)
	{

		Pair<String, Integer> pair01=new Pair<String, Integer>("Test 01", 42);
		Pair<Double, String>  pair02=new Pair<Double,String>(3.14,"Test 02");
		
		System.out.println("Printing First Pair");
		System.out.println("First Value:"+pair01.getFirst());
		System.out.println("First Value:"+pair01.getSecond());
		
		System.out.println();
		
		System.out.println("Printing Second Pair");
		System.out.println("First Value:"+pair02.getFirst());
		System.out.println("First Value:"+pair02.getSecond());
		
			

}
}