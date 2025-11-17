package pr01.exam07;

public class TextBook extends Book{

	public TextBook(String title, String author, int price) {
		super(title, author, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void discount(int percent) {
		// TODO Auto-generated method stub
		price = price * (100 - percent) / 100;
		
	}
	

}
