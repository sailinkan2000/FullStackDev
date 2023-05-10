
class Synchro
{
	public void send(String msg)
	{
		System.out.println("Sending\t" + msg );
		try
		{
			Thread.sleep(1000);
		}
		catch (Exception e)
		{
			System.out.println("Thread interrupted.");
		}
		System.out.println("\n" + msg + "Sent");
	}
}

class ThreadedSend extends Thread
{
	private String msg;
	Synchro sender;

	ThreadedSend(String m, Synchro obj)
	{
		msg = m;
		sender = obj;
	}

	public void run()
	{
		synchronized(sender)
		{
			sender.send(msg);
		}
	}
}

class SyncDemo
{
	public static void main(String args[])
	{
		Synchro send = new Synchro();
		ThreadedSend S1 =
			new ThreadedSend( " How are you " , send );
		ThreadedSend S2 =
			new ThreadedSend( " How is it all going " , send );

		S1.start();
		S2.start();
		try
		{
			S1.join();
			S2.join();
		}
		catch(Exception e)
		{
			System.out.println("Interrupted");
		}
	}
}
