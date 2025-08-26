public class Book extends TangibleAsset {
	private String isbn;
	
	public Book (Strig name, int price, String color, String isbn) {
		super (name,price,color);
		this.isbn = isbn;
	}
	publid String getIsbn() {return this.isbn;}
}
public class Main {
    public static void main(String[] args) {
        Book book = new Book("Java入門", 2500, "blue", "978-1234567890");

        System.out.println("書籍名: " + book.getName());
        System.out.println("価格: " + book.getPrice() + "円");
        System.out.println("色: " + book.getColor());
        System.out.println("ISBN: " + book.getIsbn());
    }
}
