//문제
//OrderItem 클래스 만들기
//	필드: 모두 public
//	Menu menu
//	int quantity   // 수량
//	생성자 : Menu, quantity 모두 받기
//	메소드 : int getPrice()
//→ 메뉴 단가 × 수량 리턴

package pr01.exam02;

public class OrderItem {
	
	public Menu menu;
	public int quantity;
	
	public OrderItem(Menu menu, int quantity) {
		this.menu = menu;
		this.quantity = quantity;
	}
	
	public int getPrice() {
		return menu.price * quantity;
	}
}
