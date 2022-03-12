package com.techbuzzblogs.designpattern.factory;

public class FactoryDesignPatternMain {

	public static void main(String[] args) {
		OSFactory obj = new OSFactory();
		OS ref = obj.getObject("Open");		
		ref.spec();
	}

}
