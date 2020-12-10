import de.bitmarck.services.MyService;
import de.bitmarck.services.impl.MyServiceImpl;

module tag1_02MidLevelProjekt {
	
	requires tag1_03BottomProjekt; // Immer auf Module
	
	exports de.bitmarck.services; // Verwendet man immer Pakete
	
	uses MyService;
	provides MyService with MyServiceImpl;
}