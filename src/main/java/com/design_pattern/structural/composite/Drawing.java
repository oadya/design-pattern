package com.design_pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

//A composite object contains group of leaf objects and we should provide some helper methods to add or delete leafs from the group. 
//We can also provide a method to remove all the elements from the group.
public class Drawing implements Shape {

	//collection of Shapes
	private List<Shape> shapes = new ArrayList<Shape>();
	
	public void draw(String fillColor) {
		for(Shape s : shapes){
			s.draw(fillColor);
		}

	}
	
	//adding shape to drawing
	public void add(Shape s){
		shapes.add(s);
	}
	
	//removing shape from drawing
	public void remove(Shape s){
		shapes.remove(s);
	}
	
	//removing all the shapes
	public void clear(){
		shapes.clear();
		System.out.println("\nClearing all the shapes from drawing\n");
	}
	
	
	
	

}
