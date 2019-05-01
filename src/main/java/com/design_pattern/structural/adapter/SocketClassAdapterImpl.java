package com.design_pattern.structural.adapter;

//One of the great real life example of Adapter design pattern is mobile charger. 
//Mobile battery needs 3 volts to charge but the normal socket produces either 120V (US) or 240V (India). 
//So the mobile charger works as an adapter between mobile charging socket and the wall socket.

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

	public Volt get120Volt() {
		return getVolt();
	}

	public Volt get12Volt() {
		return new Volt(getVolt().getVolts()/10) ;
	}

	public Volt get3Volt() {
		return new Volt(getVolt().getVolts()/40);
	}

}
