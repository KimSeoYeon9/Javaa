//문제
//FullTimeEmployee extends Employee
//	필드:
//	int annualSalary
//	생성자:
//	name, employeeId, annualSalary 받기
//	calculatePay() 구현
//→ 연봉 / 12 리턴


package pr01.exam03;

public class FullTimeEmployee extends Employee {
	
	protected int annualSalary;
	
	public FullTimeEmployee(String name, String employeeId, int annualSalary) {
		super(name, employeeId);
		this.annualSalary = annualSalary;
	}

	@Override
	public int caculatePay() {
		// TODO Auto-generated method stub
		return annualSalary/12; 
	}
}
