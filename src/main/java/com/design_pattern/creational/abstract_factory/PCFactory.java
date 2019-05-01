package com.design_pattern.creational.abstract_factory;

//In the Abstract Factory pattern, we get rid of if-else block and have a factory class for each sub-class. 
//Then an Abstract Factory class that will return the sub-class based on the input factory class.
public class PCFactory implements ComputerAbstractFactory {

	private String ram;
	private String hdd;
	private String cpu;
	
	
	public PCFactory(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}


	public Computer2 createComputer() {
		return new PC(ram, hdd, cpu);
	}

}
