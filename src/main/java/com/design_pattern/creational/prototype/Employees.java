package com.design_pattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;


//Prototype pattern provides a mechanism to copy the original object to a new object and then modify it according to our needs. 
//Prototype design pattern uses java cloning to copy the object.

public class Employees implements Cloneable {
	
	private List<String> empList;

	public  Employees() {
		super();
		this.empList = new ArrayList<String>();
	}

	public Employees(List<String> empList) {
		super();
		this.empList = empList;
	} 
	
	
	public List<String> getEmpList() {
		return empList;
	}

	public void loadData(){
		
		empList.add("Pankaj");
		empList.add("Raj");
		empList.add("David");
		empList.add("Lisa");
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		List<String> temp = new ArrayList<String>();
		for(String s : this.getEmpList()){
			temp.add(s);
		}
		return new Employees(temp);
}
	

}
