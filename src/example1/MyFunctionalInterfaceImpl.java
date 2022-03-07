package example1;
@FunctionalInterface
interface MyInter{
	void say(String msg);   // abstract method  
    // It can contain any number of Object class methods.  
    int hashCode();  
    String toString();  
    boolean equals(Object obj); 
}

public class MyFunctionalInterfaceImpl implements MyInter{
	
	@Override
	public void say(String msg) {
		System.out.println("Say something ... "+msg);
		
	} 
	
	public static void main(String[] args) {
		MyInter MyIn = new MyFunctionalInterfaceImpl();
		MyIn.say("I will say Nothing");

	}

	

}
