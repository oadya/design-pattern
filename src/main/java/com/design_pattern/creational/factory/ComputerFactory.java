package com.design_pattern.creational.factory;

// We can keep Factory class Singleton or we can keep the method that returns the subclass as static.
public class ComputerFactory {
	
	public static Computer getComputer(String type, String ram, String hdd, String cpu){
		
		if("PC".equalsIgnoreCase(type)){
			return new PC(ram, hdd, cpu);
			
		}else if("Server".equalsIgnoreCase(type)){
			return new Server(ram, hdd, cpu);
			
		}
		
		return null;
   }

}
