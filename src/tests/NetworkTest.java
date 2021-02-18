package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.network.networkDevices.Circuit;
import com.network.networkDevices.LinkDev;
import com.network.networkDevices.Network;
import com.network.networkDevices.Node;

public class NetworkTest {

	private Network network;
	private List<Node> nodes;
	private LinkDev link;
	private Circuit circuit;
	@Before
	public void config() {
		network = new Network();
		Node node = new Node();
		nodes = new ArrayList<>();	
		link = new LinkDev(Arrays.asList(node));
		circuit = new Circuit();
	}
	
	@Test
	public void createLinkTest() {
		link = network.createLink(nodes);
		System.out.println(link.getName());
		
	}
	
	@Test
	public void createCircuitTest() {
		
		circuit = network.createCircuit(Arrays.asList(link));
		System.out.println(circuit.getName());
	}

}
