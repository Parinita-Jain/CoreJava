package oopsbasic;

class Book{
	//Non-static member, object variable
	String name;
	String author;
	float price;
	
	//static member, class variable
	static String site = "www.bookchor.com";
	
	Book(String name, String author, float price){
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	//Non-static member, object method
	void display() {
		System.out.println("Name: " + this.name
							+ "\nAuthor: " + this.author
							+ "\nPrice: " + this.price
							+ "\nSite: " + site);
	}
	
	//static member, class method
	static void purchase() {
		System.out.println("Common Portal to purchase the book");
	}
}

public class StaticModifier {

	public static void main(String[] args) {
		Book b1 = new Book("the hobbit", "j r r tolkien", 300.56f);
		System.out.println(b1.name);
		
		Book b2 = new Book("twilight","stephenie meyer",233.43f);
		b1.display();
		b2.display();
		
		System.out.println(Book.site);
		Book.site = "www.bookalley.com";
		//System.out.println(b1.site);
		Book.purchase();
		b1.price = 400.45f;
		b1.display();
		b2.display();
		
		new Book("harry potter", "j k rowling", 300f);
	}

}
