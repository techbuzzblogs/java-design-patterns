package com.techbuzzblogs.designpattern.bridge;

//This is the implementor. 
//Note that this is also an interface
//As implementor is defining its own hierarchy which not related to abstraction hierarchy
public interface Brand {
	String brandName();
	
	String brandDetails();
}
