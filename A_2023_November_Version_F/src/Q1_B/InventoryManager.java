package Q1_B;

import java.util.HashMap;

public class InventoryManager 
{
	HashMap<String, Product> Inventory=new  HashMap<String, Product>();	
	
	
	public void addProduct(String code, String name, int quantity, double price) 
	{
		Product pr=new Product(name, quantity, price);
		Inventory.put(code, pr);
        System.out.println("Product added/updated successfully.");
	}	
	
	
	public void removeProduct(String code) 
	{
		if(Inventory.remove(code)!=null)
		{
			System.out.println("Product with code '" + code + "' was 0removed.");
        } 
		else
		{
            System.out.println("Product with code '" + code + "' was not found.");
        }
	}
	
	
	
	public void displayInventory() {
        if (Inventory.isEmpty()) 
        {
            System.out.println("Inventory is empty.");
        } 
        else 
        {
            System.out.println("Current Inventory:");            
            
            for (String id : Inventory.keySet()) 
            {
                Product product=Inventory.get(id);
                System.out.println("Code: " + id + ", " + product);
            }

        }
    }

	
	public static void main(String[] args) 
	{
		
		InventoryManager inv=new InventoryManager();
		
        System.out.println();
		inv.addProduct("P001", "Laptop", 5, 1200.00);
        inv.addProduct("P002", "Smartphone", 10, 800.00);
        inv.addProduct("P003", "Headphones", 15, 150.00);
        inv.addProduct("P004", "Tablet", 7, 600.00);
        inv.addProduct("P005", "Monitor", 3, 300.00);
        
        System.out.println();

        inv.displayInventory();
        System.out.println();
        
        inv.removeProduct("P001");
        inv.removeProduct("P002");
        
        System.out.println();
        inv.displayInventory();

		
		
	}
	
	
	
}
