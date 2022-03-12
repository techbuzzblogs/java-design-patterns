package com.techbuzzblogs.designpattern.adapter;

public class Adapter implements Charger{
	PowerPlug powerPlug = new DcPowerPlug();
	@Override
	public void powerSupply() {
		powerPlug.generatingPower();
	}

}
