package de.bitmarck;

import de.bitmarck.services.MyService;
import de.bitmarck.services.MyServiceException;

public class Client {

	private final MyService service;
	
	public Client(MyService service) {
		this.service = service;
	}


	public void go() {
		try {
			service.foo();
		} catch (MyServiceException e) {

			e.printStackTrace();
		}
	}

}
