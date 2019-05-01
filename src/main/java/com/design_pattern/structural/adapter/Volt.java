package com.design_pattern.structural.adapter;

public class Volt {
	
private int volts;
	
	public Volt(int v){
		this.volts=v;
	}

	public int getVolts() {
		return volts;
	}

	public void setVolts(int volts) {
		this.volts = volts;
	}

	@Override
	public String toString() {
		return "Volt [volts=" + volts + "]";
	}
	
	

}
