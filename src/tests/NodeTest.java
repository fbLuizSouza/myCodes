package tests;

import org.junit.Before;
import org.junit.Test;

import com.network.networkDevices.Node;

public class NodeTest {

	private Node node;
	
	@Before
	public void config() {
		node = new Node();
	}
	
	@Test
	public void addPortsTest() {
		node.addPorts(5);
	}
	
	@Test
	public void addCardsTest() {
		node.addPorts(0);
	}
}
