package exam1015;

public class PepperoniPizza extends Pizza {
	public PepperoniPizza() {
		 this("M");
	}
	
	public PepperoniPizza(String size) {
		this.size = size;
		this.name = "페퍼로니피자";
		this.prices = new int[] {15000, 20000, 30000};
		this.toppings = "PepperoniPizza";
	}
	
	@Override
	public void cook() {
		System.out.println(toppings + "을 추가합니다.");
		super.cook();
	}
}
