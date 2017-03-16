package Entities;

public class Player {
	private String name;
	private int health = 100;
	private int healthMax = 100;
	private int attack = 25;
	private int defense = 50;
	private int damage = 5;
	private int xp = 0;
	private int playerLevel = 0;
	
	
	public int getHealthMax() {
		return healthMax;
	}
	public void setHealthMax(int healthMax) {
		this.healthMax = healthMax;
	}
	public int getXp() {
		return xp;
	}
	public void setXp(int xp) {
		this.xp = xp;
	}
	public int getPlayerLevel() {
		return playerLevel;
	}
	public void setPlayerLevel(int playerLevel) {
		this.playerLevel = playerLevel;
	}
	public int getDMG() {
		return damage;
	}
	public void setDMG(int damage) {
		this.damage = damage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHP() {
		return health;
	}
	public void setHP(int HP) {
		health = HP;
	}
	public int getATK() {
		return attack;
	}
	public void setATK(int ATK) {
		attack = ATK;
	}
	public int getDFNS() {
		return defense;
	}
	public void setDFNS(int Defense) {
		defense = Defense;
	}
	
	public int quickStrike(Creature target){
		int hitFor = 0;
		System.out.println("You use QuickStrike!");
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
	
	public int heavyStrike(Creature target){
		int hitFor = 0;
		System.out.println("You use HeavyStrike!");
		int hitChance = (int) Math.ceil(Math.random() * 100);
		if(hitChance + this.getATK() -25> target.getDFNS()){
			hitFor = this.getDMG() + 5;
			System.out.println("Hit!");
			System.out.println(hitFor + " damage!");
		}else{
			System.out.println("Miss!");
		}
		target.setHP(target.getHP() - hitFor);
		return hitFor;
	}
	
	public void recover(){
		int hitFor = 0;
		System.out.println("You use Recover!");
		int hitChance = (int) Math.ceil(Math.random() * 100);
		if(hitChance + this.getATK() + 10 > this.getDFNS()){
			hitFor = this.getDMG() + 2;
			this.setHP(this.getHP() + this.getDMG() + 2);
			System.out.println("Success!");
			System.out.println(hitFor + "HP recovered!");
			if(this.getHP() > this.getHealthMax()){
				this.setHP(this.getHealthMax());
			}
		}else{
			System.out.println("Failure!");
			this.setHP(this.getHP() - 2);
		}
		System.out.println("You now have " + this.getHP() + "!");
	}
	public void levelUp(){
		this.setHealthMax(this.getHealthMax()+20);
		this.setATK(this.getATK()+5);
		this.setDFNS(this.getDFNS()+10);
		this.setDMG(this.getDMG()+2);
		this.setHP(this.getHealthMax());
		System.out.println("Level up!");
		System.out.println("You've reached level "+this.getPlayerLevel()+"!");
	}
	public void checkLevel(){
		int xpCount = this.getXp();

		for (int pl = this.getPlayerLevel(); pl < 50; pl++) {
			for (int i = 25*pl; i <= xpCount; i++) {
				this.setPlayerLevel(this.getPlayerLevel() + 1);
				this.levelUp();
			}
		}
		
	}
	
}
