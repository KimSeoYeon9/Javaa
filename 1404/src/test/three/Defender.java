package test.three;

public class Defender extends AbstractMonster {

	public Defender(String name, int hp, int attack, int defense) {
		super(name, hp, attack, defense);
		// TODO Auto-generated constructor stub
		this.name = "Defender";
		this.hp = 20;
		this.attack = 13;
		this.defense = 25;
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("Defender - Attack");
		return;
	}

}
