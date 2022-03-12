package com.techbuzzblogs.designpattern.bridge;
//A concrete implementor. 
public class DELL implements Brand {

	@Override
	public String brandName() {
		return "DELL";
	}

	@Override
	public String brandDetails() {
		return "Dell Computer Corporation";
	}

}
