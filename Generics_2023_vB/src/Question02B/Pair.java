package Question02B;

public class Pair<T,U> 
{
	T First;
	U Second;
	
	
	public Pair(T num1, U num2) 
	{
		super();
		this.First = num1;
		this.Second = num2;
	}


	public T getFirst()
	{
		return First;
	}



	public U getSecond() 
	{
		return Second;
	}


	
	
	

}
