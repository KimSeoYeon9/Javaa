package pr01.exam07;

public abstract class Book {
	
	protected String title;
	protected String author;
	protected int price;
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public abstract void discount(int percent);
	
	public void showInfo() {
		System.out.println("제목: " + title + ", 저자: " +  author + ", 가격: " + price + "원");
	}
}
