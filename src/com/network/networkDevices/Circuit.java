package com.network.networkDevices;

import java.util.ArrayList;
import java.util.List;

public class Circuit {

	private static final int START_VALUE  = 1;
	
	private final String NAME;
	private static int index = START_VALUE;
	private List<LinkDev> linksDevs = new ArrayList<LinkDev>();
	
	/*Automatic define a name when a instance of Circuit is create to simplify*/
	public Circuit() {
		this.NAME = "Circuit-" + index;
		index++;
	}

	public String getName() {
		return NAME;
	}

	public List<LinkDev> getLinksDevs() {
		return linksDevs;
	}
	
}
