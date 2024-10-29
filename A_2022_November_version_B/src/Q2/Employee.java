package Q2;

public class Employee<T,U> 
{
	 T name;
	 U empId;
	 
	public Employee(T name, U empId) 
	{
		super();
		this.name = name;
		this.empId = empId;
	}

	public T getName() 
	{
		return name;
	}

	public U getEmpId() 
	{
		return empId;
	}
	 
	 
	 

}
