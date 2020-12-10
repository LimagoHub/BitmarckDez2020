package de.bitmarck.translations.impl;

import de.bitmarck.translations.TranslationService;

public class TranslationServiceLowerImpl implements TranslationService {

	@Override
	public String getName() {
		
		return "lower";
	}

	@Override
	public String translate(String message) {
		
		return message.toLowerCase();
	}

}
