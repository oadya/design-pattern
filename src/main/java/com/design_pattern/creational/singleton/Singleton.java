package com.design_pattern.creational.singleton;

//Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine.
//The singleton class must provide a global access point to get the instance of the class.
//Singleton pattern is used for logging, drivers objects, caching and thread pool

//Private constructor to restrict instantiation of the class from other classes.
//Private static variable of the same class that is the only instance of the class.
//Public static method that returns the instance of the class, this is the global access point for outer world to get the instance of the singleton class.


public class Singleton {
	
	private static Singleton instance; 
	
	private Singleton(){}
	
	
	//1- Thread Safe Singleton
	public static synchronized  Singleton getinstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}

	//2- double-checked locking implementation.
	public static Singleton getInstanceUsingDoubleLocking(){
		
		if(instance == null){
			synchronized (Singleton.class) {
	           if(instance == null){
	        	   instance = new Singleton();
	           }
	        }
		}
		return instance;
		
	}
	
	//3- Bill Pugh Singleton Implementation : create the Singleton class using an inner static helper class
	
	 // When the singleton class is loaded, SingletonHelper class is not loaded into memory and only when someone calls the getInstance method, 
	 // this class gets loaded and creates the Singleton class instance.
	
	private static class SingletonHelper {
		private static final  Singleton INSTANCE = new Singleton();
	}
	
	public static Singleton getBillPughSingleton(){
		return SingletonHelper.INSTANCE;
	}

}
