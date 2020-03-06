package store.book;

public class Magazine extends Book implements Content
{
	   int totalPage;
	   String contents[];
	   public Magazine(String author, String name, String isbn, int totalPage, String contents[],float price)
	   {
		   super(author, name, isbn, price);
		   this.totalPage= totalPage;
		   this.contents= contents;
	   }
	   public String toString()
	   {
		   return "Magazine"+super.toString();
	   }
	   
	   public String content(int page)
	   {
		 try
		 {
		   return this.contents[page];
		 }
		 catch(Exception e)
		 {
			   System.out.println("Invalid Page number.."+page);
			   return "";
		 }
	   }
}
