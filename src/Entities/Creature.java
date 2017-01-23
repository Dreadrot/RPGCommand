package Entities;

public abstract class Creature {
	private int health = 50;
	private int attack = 12;
	private int defense = 30;
	private int damage = 4;
	private String name;
	
	public int quickStrike(Player target){
		int hitFor = 0;
		System.out.println("Enemy uses Quick Strike!");
		int hitChance = (int) Math.ceil(Math.random() * 100);
		if(hitChance + this.getATK() > target.getDFNS()){
			hitFor = this.getDMG();
			System.out.println("Hit!");
			System.out.println(hitFor + " damage!");
		}else{
			System.out.println("Miss!");
		}
		target.setHP(target.getHP() - hitFor);
		return hitFor;
	}
	
	public int getHP() {
		return health;
	}
	public void setHP(int health) {
		this.health = health;
	}
	public int getATK() {
		return attack;
	}
	public void setATK(int attack) {
		this.attack = attack;
	}
	public int getDFNS() {
		return defense;
	}
	public void setDFNS(int defense) {
		this.defense = defense;
	}

	public int getDMG() {
		return damage;
	}

	public void setDMG(int damage) {
		this.damage = damage;
	}
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
