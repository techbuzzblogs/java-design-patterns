package com.techbuzzblogs.designpattern.abstractfactory;

public class DesktopFactory extends AbstractFactory {

	@Override
	Computer getComputer(String computerBrand) {
		if(computerBrand.equalsIgnoreCase("hp")) {
			return new HPDesktop();
		}else if(computerBrand.equalsIgnoreCase("dell")){
			return new DellDesktop();
		}else {
			return null;
		}
	}

}
