package pr01.exam07;

public class Novel extends Book {

	public Novel(String title, String author, int price) {
		super(title, author, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void discount(int percent) {
		// TODO Auto-generated method stub
		price = price * 90 / 100;
		
	}
	

}
