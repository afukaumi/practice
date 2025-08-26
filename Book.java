public class Book extends TangibleAsset {
	private String isbn;
	
	public Book (Strig name, int price, String color, String isbn) {
		super (name,price,color);
		this.isbn = isbn;
	}
	publid String getIsbn() {return this.isbn;}
}
