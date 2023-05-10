
//class Next extends Thread {
	//public void run()
	//{
		//System.out.print("Extension of thread class.");
	//}
	//public static void main(String[] args)
	//{
		//Next g = new Next();
		//g.start();
	//}
//}

class Next extends Thread {
	public static void main(String args[])
	{
		// object is created of Runnable target
		Next obj = new Next();

		// runnable reference is passed to Thread
		Thread t = new Thread(obj, "obj");

		// thread is started
		t.start();

		// name of the thread is found
		System.out.println(t.getName());
	}
	@Override public void run()
	{
		System.out.println("The runable interface is found out");
	}
}
