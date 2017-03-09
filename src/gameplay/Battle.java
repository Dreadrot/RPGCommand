package gameplay;
import Entities.*;
import java.util.Scanner;
public final class Battle{
	static Scanner scan = new Scanner(System.in);
	
	public static Creature findEnemy(){
		Creature foundEnemy;
		int enemyNum = (int) Math.ceil(Math.random() * 100);
		if(enemyNum < 70){
			Slime slimey = new Slime();
			foundEnemy = slimey;
		}else if(enemyNum >= 70){
			BigCreature bigCreature = new BigCreature();
			foundEnemy = bigCreature;
		}else{
			Slime slimey = new Slime();
			foundEnemy = slimey;
		}
		
		return foundEnemy;
	}
	public static String fight(Player player, Creature creature){
		String winner = "";
		System.out.println("Brace yourself! A " + creature.getName() + " approaches!");
		while (creature.getHP() > 0 && player.getHP() > 0) {
			System.out.println("What do you wish to do?");
			System.out.println("A. QUICKSTRIKE, B. HEAVYSTRIKE, C. RECOVER (A, B or C)");
			char userChoice = scan.next().charAt(0);
			switch(userChoice){
			case 'A':
				player.quickStrike(creature);
				break;
			case 'B':
				player.heavyStrike(creature);
				break;
			case 'C':
				player.recover();
				break;
			}
			System.out.println("Enemy has " + creature.getHP() + "HP left");
			
			if(creature.getHP()>0){
				creature.quickStrike(player);
				System.out.println("Your HP is: " + player.getHP());
			}else{
				winner = player.getName();
			}
			
			if(player.getHP() < 1){
				System.out.println("You have died.");
				winner = creature.getName();
			}
		}
		return "winner: " + winner;
	}
}
