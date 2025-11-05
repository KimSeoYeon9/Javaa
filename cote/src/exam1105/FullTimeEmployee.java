package exam1105;

public class FullTimeEmployee extends Employee {
	
	public int annualSalary;
	
	public FullTimeEmployee(String name, String employeeId, int annualSalary) {
		super(name, employeeId);
		this.annualSalary = annualSalary; 
	}

	@Override
	public int calcuatePay() {
		// TODO Auto-generated method stub
		return 0;
	}
}
