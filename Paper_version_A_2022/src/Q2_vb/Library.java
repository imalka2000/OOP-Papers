package Q2_vb;

import java.util.HashMap;

public class Library
{
	public static void main(String[] args)
	{
		HashMap<Integer, Book<?, ?>> Booklist=new HashMap<>();
		
		Book<String, String> book1=new Book<String, String>("Harry potter","ISBN12345" );
		Booklist.put(1, book1);
		
		Book< String,Integer> book2=new Book< String,Integer>("Harry potter",12345);
		Booklist.put(2, book2);
		
		
		for(int id:Booklist.keySet())
		{
			Book<?, ?> value=Booklist.get(id);
			System.out.println("Book ID is :"+ id + " and the ISBN is :"+value.getBookISBN());
			
		}
		
	}
	
	

}
