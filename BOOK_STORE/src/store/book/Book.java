package store.book;

public abstract class Book implements Content
{
  private String author;
  private String name;
  private String isbn;
  private float price;
  
  public Book(String author, String name, String isbn, float price)
  {
	  this.author= author;
	  this.name= name;
	  this.isbn= isbn;
	  this.price= price;
  }
  public String toString()
  {
	  return "Book {"+ "Author = " + author +", Name = " + name +",ISBN =" + isbn +'}';
  }
  public String getAuthor()
  {
	  return author;
  }
  public void setAuthor(String author)
  {
	  this.author= author;
  }
  
  public String getName()
  {
	  return name;
  }
  public void setName(String name)
  {
	  this.name= name;
  }
  
  public String getIsbn()
  {
	  return isbn;
  }
  public void setIsbn(String isbn)
  {
	  this.isbn= isbn;
  }
  
  public float getPrice()
  {
	  return price;
  }
  public void setPrice(float price)
  {
	  this.price= price;
  }
  
  public float calculate(int qty)
  {
	  return this.price*qty;
  }
}
