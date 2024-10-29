package Q4;

public class Breakfast extends Meal
{
	@Override
	public void displayMeal()
	{
		System.out.println("Preparing Breakfast.........");		
		mealwithFlavour();
		meallnDuration();
		displayCost();		
	}

	@Override
	public void displayCost()
	{
		System.out.println("Cost for the meal = " +flavour.getcost());
	}
	
	
	
	

}
