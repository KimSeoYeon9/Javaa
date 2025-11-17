//문제
//Employee (추상 클래스)
//	필드: 모두 protected
//	String name
//	String employeeId
//	생성자:
//	(name, employeeId) 받는 생성자
//	메소드:
//	abstract int calculatePay()
//→ 자식 클래스에서 반드시 구현해야 함
//	void showEmployeeInfo()
//→ "이름: 홍길동, 사번: A01" 출력

package pr01.exam03;

public abstract class Employee {
	protected String name;
	protected String employeeId;
	
	public Employee(String name, String employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}
	
	public abstract int caculatePay();
	
	public void showEmployeeInfo() {
		System.out.println("이름: " + name + ", 사번: " + employeeId);
	}

}
