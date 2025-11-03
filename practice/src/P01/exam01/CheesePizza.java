package P01.exam01;

public class CheesePizza extends Pizaa {
	public static void main(String[] args) {
		
		public CheesePizza(){
			this("M");
		}
		
		public CheesePizza(String size) {
			super("치즈피자", new int[] {15000, 20000, 25000}, size, "Cheese");
			setSize(size);
		}
	}
}
