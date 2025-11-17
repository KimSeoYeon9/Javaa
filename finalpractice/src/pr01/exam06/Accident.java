package pr01.exam06;

public abstract class Accident {
	
	protected String type;
	protected int death;
	protected int injury;
	
	public Accident(String type, int death, int injury) {
		this.type = type;
		this.death = death;
		this.injury = injury;
	}
	
	public abstract double getSeverity();
	
	public void showInfo() {
		System.out.println("사고유형: " + type + ", 사망: " + death + "명, 부상: " + injury + "명");
	}
}
