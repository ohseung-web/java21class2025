package diExample02;

public class GreetingService {
   // DI
	public void greet(String name, Inter inter) {
		String msg = inter.sayHello(name);
		System.out.println(msg);
	}
}
