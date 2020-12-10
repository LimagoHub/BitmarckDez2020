import de.bitmarck.services.MyService;
import de.bitmarck.services.impl.MyServiceImpl;

module tag1_02MidLevelProjekt {
	exports de.bitmarck.services; // Verwendet man immer Pakete
	
	uses MyService;
	provides MyService with MyServiceImpl;
}