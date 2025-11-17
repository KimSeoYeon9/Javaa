package pr01.exam05;

public class ZooExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion l = new Lion("사자.", 5);
		Elephant e = new Elephant("코끼리.", 10);
		
		l.showInfo();
		e.showInfo();
		
		l.makeSound();
		e.makeSound();

	}

}
