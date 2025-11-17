// 문제 
//CarExample 클래스
//main 함수에서
//	기본 생성자로 Car 객체 1개 생성 후 setter로 값 설정
//	매개변수 생성자로 Car 객체 1개 생성
//	showInfo()로 두 차량 정보 출력



package pr01.exam01;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car(); //기본 생성자로 객체 하나 생성.
		c1.setBrand("기아"); //setter로 설정.
		c1.setYear(2022); //setter로 설정.
		
		Car c2 = new Car("현대", 2024); //매개변수 생성자 사용 -> brand와 year를 한 번에 초기화.
		
		c1.showInfo();
		c2.showInfo();
	}
}
