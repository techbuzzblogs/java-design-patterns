package com.techbuzzblogs.designpattern.abstractfactory;

public class LaptopFactory extends AbstractFactory {

	@Override
	Computer getComputer(String computerBrand) {
		if(computerBrand.equalsIgnoreCase("hp")) {
			return new HPLaptop();
		}else if(computerBrand.equalsIgnoreCase("dell")){
			return new DellLaptop();
		}else {
			return null;
		}
	}

}
