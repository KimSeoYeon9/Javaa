package pr01.exam06;

public class VehicleAccident extends Accident{

	public VehicleAccident(int death, int injury) {
		super("차량사고", death, injury);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public double getSeverity() {
		// TODO Auto-generated method stub
		return death * 2 + injury * 1;
	}
}
