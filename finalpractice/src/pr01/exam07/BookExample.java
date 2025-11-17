package pr01.exam07;

public class BookExample {
	public static void main(String[] args) {
		
		TextBook Text = new TextBook("수학책", "김교수", 10000);
		Novel n = new Novel("재미있는 소설", "홍작가", 15000);
		
		Text.discount(20);
		n.discount(50);
		
		System.out.println("할인 후 가격: ");
		Text.showInfo();
		n.showInfo();
	}
}
