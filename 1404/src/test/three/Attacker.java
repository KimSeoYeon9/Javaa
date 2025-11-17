package test.three;

public class Attacker extends AbstractMonster {

	public Attacker(String name, int hp, int attack, int defense) {
		super(name, hp, attack, defense);
		// TODO Auto-generated constructor stub
		this.name = "Attacker";
		this.hp = 30;
		this.attack = 20;
		this.defense = 10;
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("Attacker - Very Strong Attack");
		return;
	}

}
