package com.network.networkDevices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Node {

	private static final int START_VALUE  = 1;
	
	private static int nodeIndex = START_VALUE;
	private final String NAME;
	private List<Port> portsList = new ArrayList<Port>();
	private List<Card> cardList = new ArrayList<Card>();  
	private List<Integer> portsConnecteds;
	
	/*Start a Node with two ports just to simulate*/
	public Node() {
		this.portsList.addAll(Arrays.asList(new Port(), new Port()));
		this.NAME = "Node-" + nodeIndex;	
		nodeIndex++;
	}
		
	public String getName() {
		return NAME;
	}

	/*Gets all available ports in a node*/
	public List<Port> getPortsList() {
		return portsList;
	}

	/*Gets all available cards in a node*/
	public List<Card> getCardList() {
		return cardList;
	}

	/*Adds ports to a node*/
	public void addPorts(int numberOfPorts) {
		
		if (numberOfPorts > 0) {
			
			for (int i = 0; i < numberOfPorts; i++) {
				this.portsList.addAll(Arrays.asList(new Port()));
			}
		}		
	}	
	
	/*Defines the possibility  to add cards with more ports to the node*/
	public void addCard(List<Card> cards) {
		
		if (cards != null) {
			
			for (Card card : cards) {
				this.cardList.addAll(Arrays.asList(card));
			}
		}		
	}
	
	/*Gets all connected ports in a node*/
	public List<Integer> getPortsConnected() {
		
		this.portsConnecteds = new ArrayList<Integer>();
		
		for (Port port : this.portsList) {
			
			if(port.isConnectedOrDisconnected()) {
				this.portsConnecteds.add(port.getPortNumber());
			}
		}	
		
		return portsConnecteds;
	}	
}
