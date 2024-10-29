package Q4;

public class Lunch extends Meal
{

	@Override
	public void displayMeal()
	{
		System.out.println("Preparing Lunch.........");		
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
