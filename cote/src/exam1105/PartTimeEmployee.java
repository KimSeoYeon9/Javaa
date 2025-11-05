package exam1105;

public class PartTimeEmployee extends Employee{
		private int hourlyRate;
		private int workHours;
		
		public PartTimeEmployee(String name, String employeeId, int hourlyRate, int workHours) {
			super(name,employeeId);
			this.hourlyRate = hourlyRate;
			this.workHours = workHours;
		}

		@Override
		public int calcuatePay() {
			// TODO Auto-generated method stub
			return 0;
		}
}
