package Entities;

public class BigCreature extends Creature {

	public String generateBigName(){
		int nameNum = (int) Math.ceil(Math.random() * 100);
		String name = "";
		if(nameNum >= 0 && nameNum < 20){
			name = "Centaur";
			this.setHP(110);
			this.setATK(20);
			this.setDFNS(30);
			this.setDMG(7);
		} else if(nameNum >= 20 && nameNum < 50){
			name = "Minotaur";
			this.setHP(120);
			this.setATK(5);
			this.setDFNS(60);
			this.setDMG(10);
		}else if(nameNum >= 50 && nameNum < 90){
			name = "Cave Troll";
			this.setHP(70);
			this.setATK(25);
			this.setDFNS(50);
			this.setDMG(10);
		}else if(nameNum >= 90 && nameNum <= 100){
			name = "DemiGorgon";
			this.setHP(50);
			this.setATK(45);
			this.setDFNS(10);
			this.setDMG(15);
		}
		setName(name);
		return getName();
	}
	
}
