package Q2;

import java.util.HashMap;

public class Library {

	public static void main(String[] args) 
	{
		HashMap<Integer, Book> bookList=new HashMap<Integer, Book>();//HashMap<Integer, Book<?,?>> bookList=new HashMap<Integer, Book>();
		
		Book<String, String> book1=new Book<String, String>("Harry Potter","ISBN12345");
		bookList.put(1, book1);
		Book<String,Integer> book2=new Book<String,Integer>("Rings of Power",123456);
		bookList.put(2, book2);
		
		
		for(int id: bookList.keySet()) 
		{
			Book value = bookList.get(id);
			System.out.println("Book ID is :"+ id + " and the ISBN is: " + value.getBookISBN());
			
		}


	}

}
