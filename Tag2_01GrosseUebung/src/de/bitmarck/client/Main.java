package de.bitmarck.client;

import java.util.concurrent.TimeUnit;

import de.bitmarck.characterpublisher.CharacterPublisher;
import de.empfaenger.EndSubscriber;

public class Main {
	
	public static void main(String[] args) throws Exception{
		
		
		var endSubscriber = new EndSubscriber<Character>();
		
		var publisher = CharacterPublisher.createInstance();
		
		publisher.subscribe(endSubscriber);
		
		publisher.start();
		
		var service = publisher.getExecuterService();
		service.shutdown();
		service.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
		
		
		
	}

}
