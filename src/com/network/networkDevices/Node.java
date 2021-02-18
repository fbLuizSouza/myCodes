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
	
	/*Start a Node with two ports just to simulate*/
	public Node() {
		this.portsList.addAll(Arrays.asList(new Port(), new Port()));
		this.NAME = "Node-" + nodeIndex;	
		nodeIndex++;
	}
		
	public String getName() {
		return NAME;
	}

	public List<Port> getPortsList() {
		return portsList;
	}

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
	
	public void getPortsConnections() {
		
	}
}
