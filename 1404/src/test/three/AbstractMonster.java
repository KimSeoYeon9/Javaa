package test.three;

public abstract class AbstractMonster {
	protected String name;
	protected int hp;
	protected int attack;
	protected int defense;

	public String getName() {return name;}
	public int getHp() {return hp;}
	public int getAttack() {return attack;}
	public int getDefense() {return defense;}
	
	public AbstractMonster(String name, int hp, int attack, int defense) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
	}
	
	public void defense(int attack) {
		if(defense > attack) {
			defense = attack;
			boolean defense = true;
		}
		else {
			defense -= hp;
			boolean defense = false;
		}
		return;
	}
	
	public abstract void attack();
}
