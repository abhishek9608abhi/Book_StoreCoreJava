package store.book;

public class Novel extends Book implements Content
{
   int totalPage;
   String contents[];
   public Novel(String author, String name, String isbn, int totalPage, String contents[],float price)
   {
	   super(author, name, isbn, price);
	   this.totalPage= totalPage;
	   this.contents= contents;
   }
   public String toString()
   {
	   return "Novel"+super.toString();
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
