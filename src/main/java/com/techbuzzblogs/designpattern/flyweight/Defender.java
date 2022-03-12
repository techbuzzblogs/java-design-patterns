package com.techbuzzblogs.designpattern.flyweight;

public class Defender implements Player {

	// Intrinsic Attribute
    private final String TASK;
	// Extrinsic Attribute
    private String troops;
    
    public Defender(){
        TASK = "Defend";
    }
    
	@Override
	public void assignTroops(String troopsType) {
		this.troops = troopsType;

	}

	@Override
	public void mission() {
		 System.out.println("Defender with troops " + troops + "|" + " Task is " + TASK);

	}

	@Override
	public String toString() {
		return "Defender [TASK=" + TASK + ", troops=" + troops + "]";
	}

}
