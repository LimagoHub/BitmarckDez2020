package de.bitmarck;



import de.bitmarck.services.MyService;
import de.bitmarck.services.MyServiceException;



public class Appikation {

	public static void main(String[] args) {
		
		try {
			
			
			
			MyService service = MyService.createInstance().orElseThrow(()->new RuntimeException("Upps"));
			
			service.foo();
		} catch (MyServiceException e) {
			
			e.printStackTrace();
		}

	}

}
