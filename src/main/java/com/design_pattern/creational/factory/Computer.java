package com.design_pattern.creational.factory;


//Factory design pattern is used when we have a super class with multiple sub-classes and based on input, we need to return one of the sub-class. 
//This pattern take out the responsibility of instantiation of a class from client program to the factory class.

// Super class in factory design pattern can be an interface, abstract class or a normal java class
public abstract class Computer {
	
	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	
	@Override
	public String toString() {
		return " [RAM=" + getRAM() + ", HDD=" + getHDD() + ", CPU=" + getCPU() + "]";
	}
	
	
	

}
