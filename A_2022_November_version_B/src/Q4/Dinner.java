package Q4;

public class Dinner extends Meal
{
	@Override
	public void displayMeal()
	{
		System.out.println("Preparing Dinner.........");		
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
