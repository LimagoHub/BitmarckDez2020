import de.bitmarck.translations.TranslationService;
import de.bitmarck.translations.impl.TranslationServiceLowerImpl;
import de.bitmarck.translations.impl.TranslationServiceUpperImpl;

module tag1_03BottomProjekt {
	
		exports de.bitmarck.translations;
		
		uses TranslationService;
		provides TranslationService with TranslationServiceLowerImpl, TranslationServiceUpperImpl;
}