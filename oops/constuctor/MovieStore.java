package oops;

public class MovieStore {

	public static void main(String[] args) {
		Book book1 = new Book("Everything Everywhere All At Once","Daniels",2022,8.1);

		Book book2 = new Book("Ready Player One", "Steven Spielberg", 2018, 7.6);
		
		book1.displayInfo();
		book2.displayInfo();

	}
}
