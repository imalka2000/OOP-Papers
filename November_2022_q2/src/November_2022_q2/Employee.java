package November_2022_q2;

public class Employee<U,T>
{	
	U empID;
	T name;
	
	public Employee(U empID,T name) 
	{
		super();
		this.empID = empID;
		this.name = name;

	}

	public U getEmpID()
	{
		return empID;
	}

	
	

	
	
}
