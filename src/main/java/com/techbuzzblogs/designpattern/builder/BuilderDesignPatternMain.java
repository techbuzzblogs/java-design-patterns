package com.techbuzzblogs.designpattern.builder;

public class BuilderDesignPatternMain {

	public static void main(String[] args) {
		Phone phone = new PhoneBuilder().setBattery(5000).setCamera(true).setOs("Android").setProcessor("mediakit").getPhone();
		System.out.print("phone->"+phone.toString());
	}

}
