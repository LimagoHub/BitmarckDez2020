package de.bitmarck.translations;

import java.util.Optional;
import java.util.ServiceLoader;

public interface TranslationService {
	
	String getName();
	
	String translate(String message);
	
	static Optional<TranslationService> createInstance(String type) {
		ServiceLoader<TranslationService> serviceLoader = ServiceLoader.load(TranslationService.class);
		return serviceLoader.stream().map(sl->sl.get()).filter(ts->ts.getName().equals(type)).findFirst();
	}

}
