package com.techbuzzblogs.designpattern.bridge;
// Abstraction
// Here you are adding the composition relation
public abstract class Computer {
	Brand brand;
	public Computer(Brand brand){
		this.brand=brand;
	}
	
	abstract public void ram();
	abstract public void memory();
}
