package de.bitmarck.client;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
	
	public static void main(String[] args) {
		try {
			final var path = Path.of("text.txt");
			
			final String content = Files.readString(path);
			
			
			System.out.println(content);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
