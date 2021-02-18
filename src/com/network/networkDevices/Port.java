package com.network.networkDevices;

public class Port {

	private static final int START_VALUE  = 1;
	private static final int DEFAULT_VALUE = 0;
	
	private static int index = START_VALUE;
	
	
	private boolean connectedOrDisconnected;/* Defines if a port is connected to a device*/	
	private String deviceConnected;/* Gets the name of the object connected to a port*/
	private int portNumber;
	private int portDeviceConnected = DEFAULT_VALUE;
	
	public Port() {		
		this.portNumber = index;
		this.connectedOrDisconnected = false;
		index++;
	}

	public static int getIndex() {
		return index;
	}

	public boolean isConnectedOrDisconnected() {
		return connectedOrDisconnected;
	}

	public String getDeviceConnected() {
		return deviceConnected;
	}

	public int getPortNumber() {
		return portNumber;
	}

	public int getPortDeviceConnected() {
		return portDeviceConnected;
	}

	public void setConnectedOrDisconnected(boolean connectedOrDisconnected) {
		this.connectedOrDisconnected = connectedOrDisconnected;
	}

	public void setDeviceConnected(String deviceConnected) {
		this.deviceConnected = deviceConnected;
	}

	public void setPortDeviceConnected(int portDeviceConnected) {
		this.portDeviceConnected = portDeviceConnected;
	}
	
}
