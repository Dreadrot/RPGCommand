package gameplay;
import java.util.Scanner;

import Entities.*;
public class Game {

	public static void main(String[] args){
		Player player = new Player();
		int enemiesSlain = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hello Adventurer. What is your name?");
		player.setName(scan.nextLine());
		System.out.println("Well then, " + player.getName() + ", Let us begin!");
		
		
		Slime firstSlime = new Slime();
		System.out.println("The first creature you come across is a " + firstSlime.getName() + "!" );
		
		System.out.println(Battle.fight(player, firstSlime));
		do{
			System.out.println(Battle.fight(player, Battle.findEnemy()));
			player.checkLevel();
		}while(player.getHP() > 0);
	}

}
