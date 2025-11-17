package pr01.exam06;

public class AccidentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleAccident v = new VehicleAccident(2, 2);
		PedestraianAccident p = new PedestraianAccident(1, 3);
		
		v.showInfo();
		System.out.println("사고 심각도: " + v.getSeverity());
		
		p.showInfo();
		System.out.println("사고 심각도: " + p.getSeverity());

	}

}
