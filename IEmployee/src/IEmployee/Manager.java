package IEmployee;

public class Manager implements IEmployee 
{
	String manageriD;
	double salary;	
	
	
	public Manager(String manageriD, double salary) {
		super();
		this.manageriD = manageriD;
		this.salary = salary;
	}

	@Override
	public String showEmployeeDetails() 
	{
		String s = "Manager ID = " + this.manageriD + " , Salary = " + this.salary;
		return s;
	}
	
	

}
