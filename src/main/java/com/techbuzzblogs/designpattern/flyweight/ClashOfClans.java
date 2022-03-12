package com.techbuzzblogs.designpattern.flyweight;

import java.util.Random;

public class ClashOfClans {
	private static String[] playerType ={"Attacker", "Defender"};
	private static String[] troops = {"Dragon", "Pekka", "Wizard", "Giant"};


	public static void main(String[] args) {
		 for (int i = 0; i < 10; i++)
	        {
	            Player player = PlayerFactory.getPlayer(getRandPlayerType());
	            player.assignTroops(getRandTroops());
	            player.mission();
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
