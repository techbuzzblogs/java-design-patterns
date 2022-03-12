package com.techbuzzblogs.designpattern.adapter;

public class AcPowerPlug implements PowerPlug {

	@Override
	public void generatingPower() {
		System.out.println("Generating Power for Mobile Charge from AC Power Plug");

	}

}
