package IEmployee;

import java.util.ArrayList;

public class GenericEmployeeDemo
{
	public static void main(String[] args)
	{
		ArrayList<Engineer> engineers=new ArrayList<Engineer>();
		engineers.add(new Engineer("E0000", "IFS"));
		engineers.add(new Engineer("E1111", "IFS"));
		engineers.add(new Engineer("E2222", "99x"));
		engineers.add(new Engineer("E3333", "Cambio"));
		engineers.add(new Engineer("E4444", "Codegen"));

		
		
		ArrayList<Manager> managers=new ArrayList<Manager>();
		managers.add(new Manager("MGD5555", 250000.00));
		managers.add(new Manager("MGD4444", 2250000.00));
		managers.add(new Manager("MGD3333", 1750000.00));
		managers.add(new Manager("MGD2222", 200000.00));
		managers.add(new Manager("MGD1111", 150000.00));
		
		
		GenericEmployee genericEmployee=new GenericEmployee();
		
		genericEmployee.showElements(engineers);
		System.out.println();		
		genericEmployee.showElements(managers);


		
		
	}

}
