package com.techbuzzblogs.designpattern.bridge;
//A concrete implementor. 
public class HP implements Brand {
	@Override
	public String brandName() {
		return "HP";
	}
	@Override
	public String brandDetails() {
		return "Hewlett-Packard";
	}
}
