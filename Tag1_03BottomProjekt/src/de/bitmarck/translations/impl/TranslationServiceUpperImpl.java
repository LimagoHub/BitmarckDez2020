package de.bitmarck.translations.impl;

import de.bitmarck.translations.TranslationService;

public class TranslationServiceUpperImpl implements TranslationService {

	@Override
	public String getName() {
		
		return "upper";
	}

	@Override
	public String translate(String message) {
		
		return message.toUpperCase();
	}

}
