package com.network.networkDevices;

import java.util.ArrayList;
import java.util.List;

public class Network {

	private static final int START_VALUE  = 1;
	
	private FileDealer fileDealer;	
	private static int index = START_VALUE;
	private final String NAME;
	private List<Circuit> circuitList = new ArrayList<Circuit>();
	private List<LinkDev> linksList = new ArrayList<LinkDev>();
	private List<Node> nodeList = new ArrayList<Node>();
	
	/*Automatic define a name when a instance of Network is create to simplify*/
	public Network() {
		this.NAME = "Network-" + index;
		index++;
	}

	public static int getIndex() {
		return index;
	}

	public String getNAME() {
		return NAME;
	}

	public List<Circuit> getCircuitList() {
		return circuitList;
	}

	public List<LinkDev> getLinksList() {
		return linksList;
	}

	public List<Node> getNodeList() {
		return nodeList;
	}

	/*Creates and returns one instance the Node*/
	public Node createNode() {
		
		Node node = new Node();
		addNodeToList(node);
		return node;
	}
	
	/*Adds the node to Network nodes list*/
	private void addNodeToList(Node node) {
		this.nodeList.add(node);		
	}

	/*Creates and returns one instance the Link*/
	public LinkDev createLink(List<Node> nodes) {
		
		LinkDev link = new LinkDev(nodes);		
		addLinkToList(link);
		return link;
	}
	
	/*Adds the Link to Network LinkDev list*/
	private void addLinkToList(LinkDev link) {
		this.linksList.add(link);
	}
	
	/*Creates and returns one instance the Circuit*/
	public Circuit createCircuit(List<LinkDev> links) {
		
		Circuit circuit = new Circuit();
		circuit.getLinksDevs().addAll(links);		
		addCircuitToList(circuit);
		return circuit;
	}

	/*Adds the Link to Network Circuit list*/
	private void addCircuitToList(Circuit circuit) {
		this.circuitList.add(circuit);
		
	}	

}
