//문제
// EmployeeExample 클래스(main)
//	풀타임 직원 1명
//	파트타임 직원 1명 생성
//	이름·사번 출력 + 월급 계산해 출력

package pr01.exam03;

public class EmployeeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FullTimeEmployee f = new FullTimeEmployee("홍길동", "A01", 40000000);
		PartTimeEmployee p = new PartTimeEmployee("홍박사", "A02", 10000, 5);
		
		f.showEmployeeInfo();
			System.out.println("월급: " + f.caculatePay() + "원.");
		
		p.showEmployeeInfo();
			System.out.println("월급: " + p.caculatePay() + "원.");

	}

}
