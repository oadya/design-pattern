package com.design_pattern;

import java.awt.color.CMMException;
import java.util.List;

import com.design_pattern.creational.abstract_factory.Computer2;
import com.design_pattern.creational.abstract_factory.ComputerAbstractFactory;
import com.design_pattern.creational.abstract_factory.ComputerFactory2;
import com.design_pattern.creational.abstract_factory.PCFactory;
import com.design_pattern.creational.abstract_factory.ServerFactory;
import com.design_pattern.creational.factory.Computer;
import com.design_pattern.creational.factory.ComputerFactory;
import com.design_pattern.creational.prototype.Employees;
import com.design_pattern.creational.singleton.Singleton;
import com.design_pattern.structural.adapter.SocketAdapter;
import com.design_pattern.structural.adapter.SocketClassAdapterImpl;
import com.design_pattern.structural.composite.Circle;
import com.design_pattern.structural.composite.Drawing;
import com.design_pattern.structural.composite.Shape;
import com.design_pattern.structural.composite.Triangle;
import com.design_pattern.structural.proxy.CommandExecutor;
import com.design_pattern.structural.proxy.CommandExecutorProxy;

/**
 * Hello world!
 *
 */
public class DesignPatternMain 
{
    public static void main( String[] args )
    {
    	//singleton();
    	
    	//factory();
    	
    	//abstractFactory();
    	
    	//builder();
    	
    	//prototype();
    	
    	//adapter();
    	
    	composite();
    }
    
    private  static void singleton(){
        System.out.println( "Hello World!" );
        
        Singleton singleton1 =  Singleton.getinstance();
        System.out.println( "singleton1 " +singleton1);
        
        Singleton singleton2 =  Singleton.getInstanceUsingDoubleLocking();
        System.out.println( "singleton2 " +singleton2);
        
        Singleton singleton3 =  Singleton.getBillPughSingleton();
        System.out.println( "singleton3 " +singleton3);
    	
    }
    
    private  static void factory(){
    	
    	Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
		Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
		
		System.out.println("Factory PC Config::"+pc);
		System.out.println("Factory Server Config::"+server);
    	
    }
    
    private  static void abstractFactory(){
    	
    	Computer2 pc = ComputerFactory2.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
    	// or
    	ComputerAbstractFactory factory1 = new PCFactory("2 GB","500 GB","2.4 GHz");
    	
    	System.out.println("1- Factory PC Config::"+pc);
    	System.out.println("2- Factory PC Config::"+factory1.createComputer());
    	
    	System.out.println("/************/");
    	
    	Computer2 server = ComputerFactory2.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
    	// or
    	ComputerAbstractFactory factory2 = new ServerFactory("16 GB","1 TB","2.9 GHz");
		
		System.out.println("1- Factory Server Config::"+server);
		System.out.println("2- Factory Server Config::"+factory2.createComputer());
    	
    }
    
    private  static void builder(){
    	
    	com.design_pattern.creational.builder.Computer comp = new com.design_pattern.creational.builder.Computer.ComputerBuilder("400 GB", "1 GB")
    																											.setBluetoothEnabled(true)
    																											.setGraphicsCardEnabled(true)
    																											.build();
		System.out.println("Computer Config::"+comp);
		
    	
    }
    
    private  static void prototype(){
    	
    	Employees emp = new Employees();
    	emp.loadData();
    	
    	try {
			Employees newEmpoyee1 = (Employees) emp.clone();
			Employees newEmpoyee2 = (Employees) emp.clone();
			
		  	List<String> list1 = newEmpoyee1.getEmpList();
		  	list1.add("John");
			
			List<String> list2 = newEmpoyee2.getEmpList();
			list2.remove("Pankaj");
			
			System.out.println("emps List: "+emp.getEmpList());
			System.out.println("empsNew List1: "+list1);
			System.out.println("empsNew Lis2t: "+list2);
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    }
    
    private static void adapter(){
    	
    	SocketAdapter adapter = new SocketClassAdapterImpl();
    	
    	System.out.println("v3 volts using Class Adapter="+adapter.get3Volt().getVolts());
    	
    	System.out.println("v12 volts using Class Adapter="+adapter.get12Volt().getVolts());
    	
    	System.out.println("v120 volts using Class Adapter="+adapter.get120Volt().getVolts());
    	
    	
    }
    
    
    
    private static void composite(){
    	
    	Shape triangle1 = new Triangle();
    	Shape triangle2 = new Triangle();
    	
    	Shape circle = new Circle();
    	
    	Drawing drawing = new Drawing();
    	drawing.add(triangle1);
    	drawing.add(triangle2);
    	drawing.add(circle);
    	
    	drawing.draw("RED");
    	
    	drawing.clear();
    	
    	drawing.add(triangle1);
    	drawing.add(circle);
    	
    	drawing.draw("GREEN");
    	
    	
    	
    }
    
    
    private static void proxy(){
    	
    	CommandExecutor executor = new CommandExecutorProxy("Pankaj", "wrong_pwd");
    	
    	try {
    		executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			
			System.out.println("Exception Message::"+e.getMessage());
		}
    	
    	
    	
    }
    
}
