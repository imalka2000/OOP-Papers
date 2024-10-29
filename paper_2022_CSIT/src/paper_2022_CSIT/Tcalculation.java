package paper_2022_CSIT;

import java.util.ArrayList;

public class Tcalculation<T extends Number> 
{
	ArrayList<T> numList=new ArrayList<>();
	
	
	
	void append(T value)
	{
		numList.add(value);
	
	}
	
	
	
	public double average()
	{
		double tot=0;
		
		for(T value:numList)
		{
			tot+=value.doubleValue();
		}
		
		return tot/numList.size();
		
	}
	

}
