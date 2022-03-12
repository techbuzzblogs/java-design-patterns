package com.techbuzzblogs.designpattern.abstractfactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String computerType) {
		if(computerType.equalsIgnoreCase("laptop")) {
			return new LaptopFactory();
		}else if(computerType.equalsIgnoreCase("desktop")){
			return new DesktopFactory();
		}else {
			return null;
		}
		
		
	}
}
