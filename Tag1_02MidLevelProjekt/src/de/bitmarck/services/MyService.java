package de.bitmarck.services;

import java.util.Optional;
import java.util.ServiceLoader;



public interface MyService {
	
	void foo() throws MyServiceException;
	
	static Optional<MyService> createInstance() {
		ServiceLoader<MyService> serviceLoader = ServiceLoader.load(MyService.class);
		return serviceLoader.findFirst();
	}

}
