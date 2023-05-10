

public class Demon{

    private static Object LOCK = new Object();
    
    public static void main(String[] args)
    throws InterruptedException {
    
        Thread.sleep(2000);
    
        System.out.println("Thread '" + Thread.currentThread().getName() +
        "' is set to woken after been sleeping for 2 second");
    
        synchronized (LOCK)
        {
            LOCK.wait(2000);
        
            System.out.println("Object '" + LOCK + "' is set to woken after" +
            " been waiting for 2 second");
        }
    }
    }
    