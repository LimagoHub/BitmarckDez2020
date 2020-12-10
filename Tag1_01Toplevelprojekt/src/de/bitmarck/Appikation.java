package de.bitmarck;



import de.bitmarck.services.MyService;




public class Appikation {

	public static void main(String[] args) {
		
		
		
		MyService service = MyService.createInstance().get();
		
		Client client = new Client(service);
		client.go();

	}

}
