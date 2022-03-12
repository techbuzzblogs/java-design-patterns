package com.techbuzzblogs.designpattern.bridge;
//Refined Abstraction
public class Laptop extends Computer{

	public Laptop(Brand brand) {
		super(brand);
	}

	@Override
	public void ram() {
		System.out.println("Laptop Ram is 8 GB and Brand is "+brand.brandName());
	}

	@Override
	public void memory() {
		System.out.println("Laptop Memory is 500 GB and Brand is "+brand.brandName());
		
	}

}
