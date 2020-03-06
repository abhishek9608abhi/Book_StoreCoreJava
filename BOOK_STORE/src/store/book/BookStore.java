package store.book;
import java.util.Scanner;
public class BookStore 
{
	public static void main(String[] args) 
	{
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t WELCOME TO BOOK STORE");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t ENTER TYPE OF BOOK");
		for(;;)
		{
		  System.out.println("1. Novel");
		  System.out.println("2. Magazine");
		  Scanner scan= new Scanner(System.in);
		  System.out.println("Enter Your Choice :");
		  String type=scan.next();
		
		  Book book= null;
		  if(type.equals("1") || type.equals("2"))
		  {
			 System.out.println("Author :");
			 String author=scan.next();
			 System.out.println("Name :");
			 String name= scan.next();
			 System.out.println("ISBN :");
			 String isbn=scan.next();
			 System.out.println("Total page :");
			 int totalPage= scan.nextInt();
			
		 	 String contents[]= new String[totalPage];
			 for(int i=0;i<totalPage;i++)
			 {
				System.out.println("content page"+(i+1)+": ");
				contents[i]= scan.next();
			 }
			 scan= new Scanner(System.in);
			 System.out.println("Enter Price :");
			 float price=scan.nextFloat();
			
			 System.out.println("Enter the Quantity :");
			 int qty=scan.nextInt();
			
			
		 	 System.out.println("=====================Your Data IS========================");
			 if(type.equals("1"))
			 {
			 	book= new Novel(author, name, isbn, totalPage, contents, price);
			 }
			 else if(type.equals("2"))
			 {
				book= new Magazine(author, name, isbn, totalPage, contents, price);
			 }
			  System.out.println(book.toString());
			  for(int i=0;i<totalPage;i++)
			  {
				 System.out.println("content page"+i+" = "+book.content(i));
			  }
			  System.out.println();
			
			  float amount= book.calculate(qty);
			  System.out.println("Total Amount:"+amount);
		  }
		  else
		  {
			 System.out.println("Invalid Choice");	  
		  }
		
		  System.out.println("Press 1 for exit ");
		  int type1 = scan.nextInt();
		  if(type1==1)
		  {
			System.exit(0);
		  }
		}
	}
}


