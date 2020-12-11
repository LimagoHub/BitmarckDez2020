package de.bitmarck;

import de.bitmarck.services.MyService;
import de.bitmarck.services.MyServiceException;
import de.bitmarck.translations.TranslationService;

public class Client {

	private final MyService service;
	
	public Client(MyService service) {
		this.service = service;
	}


	public void go() {
		
		TranslationService translationService = TranslationService.createInstance("lower").get();
		System.out.println(translationService.translate("XxXxXx"));
		
		try {
			service.foo();
		} catch (MyServiceException e) {

			e.printStackTrace();
		}
	}

}
