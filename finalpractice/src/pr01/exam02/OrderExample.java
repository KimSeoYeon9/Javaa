//문제
//OrderExample 클래스 만들기(main)
//	Menu 객체 3개 생성 (이름·가격은 자유)
//	OrderItem 객체 1개 생성 (메뉴 선택해서)
//	총 가격 출력

package pr01.exam02;

public class OrderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu m1 = new Menu("아메리카노", 2000);
		Menu m2 = new Menu("카페라떼", 3000);
		Menu m3 = new Menu("연유라떼", 4000);
		
		OrderItem order = new OrderItem(m3, 2);
		
		System.out.println("총 가격: " + order.getPrice() + "원");

	}
}
