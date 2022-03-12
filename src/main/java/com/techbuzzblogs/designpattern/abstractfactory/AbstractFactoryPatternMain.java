package com.techbuzzblogs.designpattern.abstractfactory;

public class AbstractFactoryPatternMain {

	public static void main(String[] args) {
		AbstractFactory factory = FactoryProducer.getFactory("desktop");
		Computer computer = factory.getComputer("hp");
		computer.spec();
	}

}
