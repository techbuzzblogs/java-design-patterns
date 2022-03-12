package com.techbuzzblogs.designpattern.flyweight;

import java.util.Random;

public class ProblemCOC {

	private static String[] playerType ={"Attacker", "Defender"};
	private static String[] troops = {"Dragon", "Pekka", "Wizard", "Giant"};


	public static void main(String[] args) {
		Player player = null;
		 for (int i = 0; i < 10; i++)
	        {
			 if(getRandPlayerType().equals("Attacker")) {
				 player = new Attacker();
				 player.assignTroops(getRandTroops());
			 }else {
				 player = new Defender();
				 player.assignTroops(getRandTroops()); 
			 }
	        }
	  }

	public static String getRandPlayerType()
    {
        Random r = new Random();
        int randInt = r.nextInt(playerType.length);
        return playerType[randInt];
    }
    public static String getRandTroops()
    {
        Random r = new Random();
        int randInt = r.nextInt(troops.length);
        return troops[randInt];
    }
}
