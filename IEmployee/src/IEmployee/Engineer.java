package IEmployee;

public class Engineer implements IEmployee 
{
	
	String empioyeciD;
	String Company;
	
	public Engineer(String empioyeciD, String company) 
	{
		super();
		this.empioyeciD = empioyeciD;
		Company = company;
	}

	@Override
	public String showEmployeeDetails() {
		
		String s = "Engineer = " + this.empioyeciD + ", Company = " + this.Company;
		
		return s;
	}
	
	
	

}
