package com.network.networkDevices;

import java.util.List;

public class LinkDev {

	private static final int START_VALUE  = 1;
	
	private static int index = START_VALUE;
	private final String NAME;
	private List<Node> nodesList;
	
	/*Automatic define a name when a instance of Link is create to simplify*/
	public LinkDev(List<Node> nodes) {
		this.NAME = "Link-" + index;
		this.nodesList = nodes;
		index++;
	}

	public String getName() {
		return NAME;
	}

	/*Gets the nodes linked*/
	public List<Node> getNodesList() {
		return nodesList;
	}	
	
}
