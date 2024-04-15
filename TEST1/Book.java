package TEST1;

public class Book {
	private String title;
	private String author;
	private int price;
	
	public Book(String title,String author,int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void bookPrint() {
		System.out.println("제목:"+this.title);
		System.out.println("저자:"+this.author);
		System.out.println("가격:"+this.price);
		System.out.println("\n");
	}
}
