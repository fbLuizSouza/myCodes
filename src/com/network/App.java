package com.network;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.network.networkDevices.Circuit;
import com.network.networkDevices.LinkDev;
import com.network.networkDevices.Network;
import com.network.networkDevices.Node;
 

public class App {

	/*Fabio Luiz Cesario de Souza*/
	
	public static void main(String[] args) {
		
		StringBuilder auxStringBuilder = new StringBuilder();
		
		Network network = new Network();
		List<LinkDev> linksDev = new ArrayList<>();
		List<Circuit> circuitList;
		List<Node> nodeList;;
		
		/* Creates instances of nodes to simulate the network*/
		
		Node node1 = network.createNode();
		Node node2 = network.createNode();
		Node node3 = network.createNode();
		
		/* Sets node ports association, making the links*/
		
		node1.getPortsList().get(0).setConnectedOrDisconnected(true);
		node1.getPortsList().get(0).setDeviceConnected(node2.getName());
		node1.getPortsList().get(0).setPortDeviceConnected(node2.getPortsList().get(0).getPortNumber());
		
		node2.getPortsList().get(0).setConnectedOrDisconnected(true);
		node2.getPortsList().get(0).setDeviceConnected(node1.getName());
		node2.getPortsList().get(0).setPortDeviceConnected(node1.getPortsList().get(0).getPortNumber());
		
		node2.getPortsList().get(1).setConnectedOrDisconnected(true);
		node2.getPortsList().get(1).setDeviceConnected(node3.getName());
		node2.getPortsList().get(1).setPortDeviceConnected(node3.getPortsList().get(0).getPortNumber());
		
		node3.getPortsList().get(0).setConnectedOrDisconnected(true);
		node3.getPortsList().get(0).setDeviceConnected(node2.getName());
		node3.getPortsList().get(0).setPortDeviceConnected(node2.getPortsList().get(1).getPortNumber());
		
		/* Sets links between two ports*/		
		LinkDev linkDev1 = network.createLink(Arrays.asList(node1, node2));
		LinkDev linkDev2 = network.createLink(Arrays.asList(node2, node3));
		
		/*Gets the node list to use in this simulation*/
		nodeList = network.getNodeList();
		linksDev.addAll(Arrays.asList(linkDev1, linkDev2));	
		
		/*Gets the circuit to use in this simulation*/
		Circuit circuit = network.createCircuit(linksDev);
		circuitList = network.getCircuitList();
		
		/*Shows nodes, links and circuits in the console
		 * getting the nodes*/		
		for (Node node : nodeList) {
			auxStringBuilder.append(node.getName() + ", ");
		}
		
		auxStringBuilder.append("\n");	
		
		for (LinkDev linkDev : linksDev) {			
			auxStringBuilder.append(linkDev.getName() + ": ");	
			int i = 0, aux  = 1;			
			auxStringBuilder.append(linkDev.getNodesList().get(i).getName() + "----" + linkDev.getNodesList().get(aux).getName() + " ");
			i++;
			aux++;
		}
		
		auxStringBuilder.append("\n");	
		
		for (Circuit c : circuitList) {
		
			auxStringBuilder.append(circuit.getName() + " ");
			
			for (LinkDev link : c.getLinksDevs()) {
				auxStringBuilder.append(link.getNodesList().get(0).getName() + " ");
				auxStringBuilder.append(link.getNodesList().get(1).getName() + " ");		
			}
		
			System.out.println(auxStringBuilder);		
		}
	}
			
}


