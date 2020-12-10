package de.bitmarck.services.impl;

import de.bitmarck.services.MyService;
import de.bitmarck.services.MyServiceException;

public class MyServiceImpl implements MyService{

	@Override
	public void foo() throws MyServiceException {
		System.out.println("Hier ist foo");
		
	}

}
