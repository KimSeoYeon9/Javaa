package exam1015;

public class ConbinationPizza extends Pizza{
	public ConbinationPizza() {
		this("M");
	}
	
	public ConbinationPizza(String size) {
		this.size = size;
		this.name = "콤비네이션피자";
		this.prices = new int[] {10000, 20000, 30000};
		this.toppings = "ConbinationPizza";
	}
	
	@Override
	public void cook() {
		System.out.println(toppings + "을 추가합니다.");
		super.cook();
	}
}
