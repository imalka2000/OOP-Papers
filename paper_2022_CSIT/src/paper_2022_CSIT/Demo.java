package paper_2022_CSIT;

public class Demo 
{
	public static void main(String[] args) {
		
		
		
		
		Tcalculation<Integer> integer=new Tcalculation<Integer>();
		integer.append(12);
		integer.append(1);
		integer.append(23);
		integer.append(2);
		integer.append(20);
		
		
		Tcalculation<Double> dob=new Tcalculation<Double>();
		dob.append(11.0);
		dob.append(11.2);
		dob.append(12.2);
		dob.append(45.2);
		dob.append(14.2);
		
		
		System.out.println(integer.average());
		System.out.println("\n" + dob.average());
		
		
	}

}
