package com.network.networkDevices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Card {

	private static final int START_VALUE  = 1;
	
	private final String NAME;
	private static int index = START_VALUE;
	private List<Port> cardPortList = new ArrayList<Port>();
	 
	/*Automatic define a name when a instance of Card is create to simplify*/
	public Card() {
		this.NAME = "Card-" + index;
		this.cardPortList.addAll(Arrays.asList(new Port(), new Port()));
		index++;
	}

	public String getName() {
		return NAME;
	}

	public static int getIndex() {
		return index;
	}

	public List<Port> getCardPortList() {
		return cardPortList;
	}
}
