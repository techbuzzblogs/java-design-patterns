package com.techbuzzblogs.designpattern.prototype;

public class PrototypeDesignPatternMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		Company company1 = new Company();
		company1.setCompanyId(1000);
		company1.setCompanyName("CTS");
		company1.loadEmployees();
		
		Company company2 = (Company) company1.clone();
		company2.setCompanyName("TCS");
		company2.setCompanyId(1002);
		
		company1.getEmployeeList().remove(0);
		
		System.out.println("company1"+company1.toString());
		System.out.println("company2"+company2.toString());
		
		System.out.println("company1 hashcode=>"+company1.hashCode());
		System.out.println("company2 hashcode=>"+company2.hashCode());
		
		
	}

}
