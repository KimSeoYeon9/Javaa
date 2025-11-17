// 문제 
//Car 클래스 만들기
//
//필드 (모두 private)
//	String brand (브랜드)
//	int year (출시연도)
//
//생성자
//	기본 생성자
//	brand와 year를 모두 받는 생성자
//
//메소드
//	각 필드의 getter/setter
//	showInfo() :
//→ "브랜드: 현대, 출시년도: 2024" 형태로 출력


package pr01.exam01;

public class Car {
	private String brand;
	private int year;
	
	public Car() {}
	
	public Car(String brand, int year) {
		this.brand = brand;
		this.year = year;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void showInfo() {
		System.out.println("브랜드: " + brand + ", 출시년도: " + year);
	}

}
