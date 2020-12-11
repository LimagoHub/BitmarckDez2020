package de.bitmarck.characterpublisher;

import java.util.ServiceLoader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Flow.Publisher;

public interface CharacterPublisher extends Publisher<Character>{
	
	ExecutorService getExecuterService();
	void start();
	
	static CharacterPublisher createInstance() {
		return ServiceLoader.load(CharacterPublisher.class).findFirst().get();
	}

}
