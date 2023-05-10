
public abstract class Super {

	public abstract void doSomething();
}
public class ClassA extends Super{
	
	@Override
	public void doSomething(){
		System.out.println("doSomething implementation of A");
	}
	
	//ClassA own method
	public void methodA(){
		
	}
}