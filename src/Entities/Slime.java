package Entities;

public class Slime extends Creature{
		
	
	public Slime() {
		this.generateSlimeName();
	}

	public String generateSlimeName(){
		int prefixNum = (int) Math.ceil(Math.random() * 100);
		String prefix = "";
		if(prefixNum == 0){
			prefix = "Large";
			this.setHP(100);
			this.setATK(20);
			this.setDFNS(50);
		}else if(prefixNum > 1 && prefixNum < 20){
			prefix = "Gooey";
		} else if(prefixNum >= 20 && prefixNum < 50){
			prefix = "Chubby";
		}else if(prefixNum >= 50 && prefixNum < 90){
			prefix = "Wibbly";
		}else if(prefixNum >= 90 && prefixNum <= 100){
			prefix = "Lovey";
		}
		setName(prefix + " Slime");
		return getName();
	}
	
	
	
}
