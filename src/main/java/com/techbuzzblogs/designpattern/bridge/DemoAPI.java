package com.techbuzzblogs.designpattern.bridge;

public class DemoAPI {

	public static void main(String[] args) {
		Computer computer = new Desktop(new DELL());
		computer.ram();
		computer.memory();
	}

}
