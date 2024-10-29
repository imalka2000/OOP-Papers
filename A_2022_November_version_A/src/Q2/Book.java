package Q2;

public class Book <T,U>
{
	 T bookTitle;
	 U bookISBN;
	
	 public Book(T bookTitle, U bookISBN) 
	 {
		super();
		this.bookTitle = bookTitle;
		this.bookISBN = bookISBN;
	 }

	public T getBookTitle()
	{
		return bookTitle;
	}

	public U getBookISBN() 
	{
		return bookISBN;
	}
}
