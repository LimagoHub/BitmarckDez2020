package de.bitmarck;



import java.lang.reflect.Method;

import de.bitmarck.services.MyService;




public class Appikation {

	public static void main(String[] args) throws Exception{
		
		
		
//		MyService service = MyService.createInstance().get();
//		
//		Client client = new Client(service);
//		client.go();
		
		
		Object o = Class.forName("de.bitmarck.tiere.Schwein").newInstance();
		System.out.println(o);
		Method m = o.getClass().getMethod("fressen");
		m.invoke(o);
		System.out.println(o);
		m = o.getClass().getDeclaredMethod("setGewicht", int.class);
		m.setAccessible(true);
		m.invoke(o, -100);
		System.out.println(o);

	}

}
