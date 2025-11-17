package test.two;

public class CustomerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cust1 = new Customer("a", "010-1234-5678");
		Customer cust2 = new Customer("b", "010-2345-6789", 100);
		
		System.out.println(cust1.updatePoint(50));
		System.out.println(cust2.setPoint(50));
		

	}

}
