import de.bitmarck.services.MyService;
import de.bitmarck.services.impl.MyServiceImpl;

module tag1_02MidLevelProjekt {
	
	requires transitive tag1_03BottomProjekt; // Immer auf Module
	
	exports de.bitmarck.services; // Verwendet man immer Pakete
	exports de.bitmarck.tiere; // Verwendet man immer Pakete
	opens de.bitmarck.tiere;
	
	uses MyService;
	provides MyService with MyServiceImpl;
}