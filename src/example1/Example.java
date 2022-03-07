package example1;

@FunctionalInterface
interface MyInterface{
	void say();
}
public class Example implements MyInterface{
	
	@Override
	public void say() {
		System.out.println("Message ...");
		
	}
	public static void main(String[] args) {
		MyInterface MyIn = new Example();
		MyIn.say();
	}

}
