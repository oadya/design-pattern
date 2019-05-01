package com.design_pattern.creational.abstract_factory;

public class ComputerFactory2 {
	
	public static Computer2 getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}

}
