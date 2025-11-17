package pr01.exam06;

public class PedestraianAccident extends Accident {

	public PedestraianAccident(int death, int injury) {
		super("보행자 사고", death, injury);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSeverity() {
		// TODO Auto-generated method stub
		return death * 3 + injury * 1;
	}
}
