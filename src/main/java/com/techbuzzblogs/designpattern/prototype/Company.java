package com.techbuzzblogs.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class Company implements Cloneable{
	private int companyId;
	private String companyName;
	private List<Employee> employeeList = new ArrayList();
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public List<Employee> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	
	public void loadEmployees() {
		Employee e1 = new Employee(1, "Vinoth Kumar", "Chennai");
		Employee e2 = new Employee(2, "Manoj Prabhu", "Chennai");
		Employee e3 = new Employee(3, "Johni", "Bangalore");
		Employee e4 = new Employee(1, "Raskin", "Mumbai");
		Employee e5 = new Employee(1, "Kishore", "Delhi");
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
	}
	
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", employeeList=" + employeeList
				+ "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//return super.clone();
		
		Company company = (Company) super.clone();
		company.setEmployeeList(new ArrayList(employeeList));
		return company;
	}
	
	
}
