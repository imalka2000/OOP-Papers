package Q2;

import java.util.HashMap;

public class Company 
{

	public static void main(String[] args)
	{
		HashMap<Integer, Employee<?, ?>> empList=new HashMap<Integer, Employee<?,?>>();
		
		Employee<String, String> emp1=new Employee<String, String>( "Nishan ","EMP12345");
		empList.put(1, emp1);
		
		Employee< String,Integer> emp2=new Employee< String,Integer>("Nishan ",12345);
		empList.put(2, emp2);	
		
		
		
		
		for(int id:empList.keySet())
		{
			Employee val=empList.get(id);
			System.out.println("Employee Number :"+id+ " and Employee ID is :"+val.getEmpId());
			
		}
	}

}
