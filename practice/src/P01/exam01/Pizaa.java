package P01.exam01;

public abstract class Pizaa {
	private String name;
	private String size;
	private int[] prices;
	private String toppings;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int[] getPrices() {
		return prices;
	}

	public void setPrices(int[] prices) {
		this.prices = prices;
	}

	public String getToppings() {
		return toppings;
	}

	public void setToppings(String toppings) {
		this.toppings = toppings;
	}
	
	public void cook() {
		System.out.println(toppings + "을 추가합니다.");
		System.out.println(name + size + "을 조리합니다.");
		System.out.println(name + size + "이 완성되었습니다.");
	}
	
	public void serve() {
		int price;
		switch (size) {
		case "S" : price = prices[0]; break;
		case "L" : price = prices[2]; break;
		default : price = prices[1]; break;
		}
		System.out.println(name + " " + size + "입니다. 가격: " + price + "원");
	}
	
	

}
