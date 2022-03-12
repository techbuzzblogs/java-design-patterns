package com.techbuzzblogs.designpattern.adapter;

public class DcPowerPlug implements PowerPlug {

	@Override
	public void generatingPower() {
		System.out.println("Generating Power for Mobile Charge from DC Power Plug");

	}

}
