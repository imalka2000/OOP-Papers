package November_2022_q2;

import java.util.HashMap;

public class Company 
{
	public static void main(String[] args)
	{
		
		HashMap<Integer, Employee<?, ?>> empList=new HashMap<>();
		
		Employee<String, String> emp1=new Employee<String, String>("EMP12345", "Nishan Perera");
		empList.put(1, emp1);

		Employee<Integer, String> emp2=new Employee<Integer, String>(123456,"Krishan Gamage");
		empList.put(2, emp2);
		
		
		for(int id:empList.keySet())
		{			
			Employee<?, ?> value=empList.get(id);
			System.out.println("Emolyee number : " + id + " and the Employee ID is :" +value.getEmpID());
			
		}				
	}


}
