//문제
// PartTimeEmployee extends Employee
//	필드:
//	int hourlyWage
//	int hoursWorked
//	생성자:
//	name, employeeId, hourlyWage, hoursWorked 받기
//	calculatePay() 구현
//→ 시급 × 일한 시간 리턴


package pr01.exam03;

public class PartTimeEmployee extends Employee{
	
	protected int hourlyWage;
	protected int horsWorked;

	public PartTimeEmployee(String name, String employeeId, int hourlyWage, int horsWorked) {
		super(name, employeeId);
		this.hourlyWage = hourlyWage;
		this.horsWorked = horsWorked;
	}

	@Override
	public int caculatePay() {
		// TODO Auto-generated method stub
		return hourlyWage * horsWorked;
	}

}
