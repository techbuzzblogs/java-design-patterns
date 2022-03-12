package com.techbuzzblogs.designpattern.builder;

public class Phone {
	private String os;
	private int ram;
	private String processor;
	private double screenSize;
	private int battery;
	private boolean camera;
	public Phone(String os, int ram, String processor, double screenSize, int battery, boolean camera) {
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.screenSize = screenSize;
		this.battery = battery;
		this.camera = camera;
	}
	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", screenSize=" + screenSize
				+ ", battery=" + battery + ", camera=" + camera + "]";
	}
	
	
	
}
