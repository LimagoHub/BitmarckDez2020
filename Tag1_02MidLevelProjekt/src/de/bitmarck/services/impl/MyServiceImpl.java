package de.bitmarck.services.impl;

import de.bitmarck.services.MyService;
import de.bitmarck.services.MyServiceException;
import de.bitmarck.translations.TranslationService;

public class MyServiceImpl implements MyService{

	@Override
	public void foo() throws MyServiceException {
		
		TranslationService translationService = TranslationService.createInstance("lower").get();
		
		System.out.println(translationService.translate("Hier ist foo"));
		
	}

}
