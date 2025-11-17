package test.three;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractMonster m1 = new Attacker("Attacker", 30, 20, 10);
		
		AbstractMonster m2 = new Defender("Defender", 20, 13, 25);
		
		System.out.println(m1.defense(m2.attack()));
		System.out.println(m1.defense(m2.attack()));
		

	}

}
