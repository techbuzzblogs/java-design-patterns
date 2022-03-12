package com.techbuzzblogs.designpattern.flyweight;

public class Attacker implements Player {

	// Intrinsic Attribute
    private final String TASK;
	// Extrinsic Attribute
    private String troops;
    
    public Attacker(){
        TASK = "Attack";
    }
	@Override
	public void assignTroops(String troopsType) {
		this.troops = troopsType;

	}

	@Override
	public void mission() {
		 System.out.println("Attacker with troops " + troops + "|" + " Task is " + TASK);
	}
	
	@Override
	public String toString() {
		return "Attacker [TASK=" + TASK + ", troops=" + troops + "]";
	}

}
