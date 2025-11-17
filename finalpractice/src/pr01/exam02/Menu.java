//문제
// Menu 클래스 만들기
//	필드: 모두 public
//	String name
//	int price
//	생성자
//	기본 생성자
//	(name, price) 받는 생성자

package pr01.exam02;

public class Menu {
	public String name;
	public int price;
	
	public Menu() {}
	
	public Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}
}
