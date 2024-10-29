package Q2_vb;

public class Book<T,U> 
{	
	T bookTitle;
	U bookISBN;
	
	
	public Book(T bookTitle, U bookISBN) 
	{
		super();
		this.bookTitle = bookTitle;
		this.bookISBN = bookISBN;
	}


	public U getBookISBN() {
		return bookISBN;
	}

}
