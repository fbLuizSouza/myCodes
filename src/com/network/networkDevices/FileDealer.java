package com.network.networkDevices;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileDealer {

	private FileReader fr;
	private Scanner reader;
	private StringBuilder auxBuilder;
	
	public FileDealer(){
		 
	}
	
	public String readFile(File file) {
		
		auxBuilder = new StringBuilder();
		
		try {
			fr = new FileReader(file);
			reader = new Scanner(fr);
			
			while (reader.hasNextLine()) {
				/*-----------------------*/
				/*Do something here...*/				
			}
		} catch (FileNotFoundException fileException) {
			String msgString = "It was not possible to open this file!";
			fileException.getMessage();			
		}
		return auxBuilder.toString();
	}
}
