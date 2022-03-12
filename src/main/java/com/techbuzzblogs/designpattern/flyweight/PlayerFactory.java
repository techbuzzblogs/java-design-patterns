package com.techbuzzblogs.designpattern.flyweight;

import java.util.HashMap;

public class PlayerFactory {
	/* HashMap stores the reference to the object
    of Attacker or Defender  */
	private static HashMap <String, Player> players =new HashMap<String, Player>();
	
	// Method to get a player
    public static Player getPlayer(String type)
    {
        Player player = null;
        if(players.get(type) != null) {
        	player = players.get(type);
        }else {
        	if(type.equals("Attacker")) {
        		player = new Attacker();
        	}else if(type.equals("Defender")) {
        		player = new Defender();
        	}
        	players.put(type, player);
        }
        return player;
    }
	
}
