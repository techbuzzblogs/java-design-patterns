package com.techbuzzblogs.designpattern.bridge;

// Refined Abstraction
public class Desktop extends Computer{

	public Desktop(Brand brand) {
		super(brand);
	}

	@Override
	public void ram() {
		System.out.println("Desktop Ram is 16 GB and Brand is "+brand.brandName());
		
	}

	@Override
	public void memory() {
		System.out.println("Desktop memory is 1 TB and Brand is "+brand.brandName());
		
	}

}
