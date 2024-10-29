package Q4;

public abstract class Meal 
{
	IprepareDeliciously flavour;
	IPrepareQuickly duration;
	
	public void setFlavour(IprepareDeliciously flavour)
	{
		this.flavour = flavour;
	}
	public void setDuration(IPrepareQuickly duration) 
	{
		this.duration = duration;
	}
	
	
	public void  mealwithFlavour() 
	{
		flavour.addFlavour();			
	}
	
	public void meallnDuration()
	{		
		duration.deliveryTime();
	}
	
	public abstract void displayMeal();	
	public abstract void displayCost();
	
	
}
