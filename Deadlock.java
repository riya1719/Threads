package Threadss;


class Family  implements Runnable
{
	String resource1 = "TV";
	String resource2 = "Playstation";

	

	 public void run()
	{
		
	   String name = Thread.currentThread().getName();
	
	   if (name.equals("Riya"))
	    RiyaAcquiredResource();
	    
	   else
		RoyalAcquiredResource();

	}
	 
	 void RiyaAcquiredResource()
	 {
		 synchronized (resource2)
		 {
//			 try
//			 {
				 System.out.println("Riya Acquired Playstation");
				// Thread.sleep(1000);
				 
				 synchronized (resource1)
				 {
					 System.out.println("Riya Acquired TV");
				//	 Thread.sleep(1000);
				 }
//			 }
//			 catch (Exception e)
//			 {
//				 System.out.println("Riya Failed to acquire resource 1");
//
//			 }
		 }
	 }
	 
	 
	void RoyalAcquiredResource()
	 {
		
			 synchronized (resource1)
			 {
				 try
				 {
					 System.out.println("Royal Acquired TV");
					 Thread.sleep(1000);
					 
					 synchronized (resource2)
					 {
						 System.out.println("Royal Acquired Playstation");
						 Thread.sleep(1000);
					 }
				 }
				 catch (Exception e)
				 {
					 System.out.println("Royal Failed to acquire resource 2");

				 }
			 }
			
		}

	 }
	 


public class Deadlock {
	
    public static void main(String[] args) throws InterruptedException
    {
    	Family  obj1 = new Family ();

		Thread t1 = new Thread (obj1);
		Thread t2 = new Thread (obj1);
		
		t1.setName("Riya");
		t2.setName("Royal");

		t1.start();
	  //   t1.join();
		t2.start();
		
		
		
    }
}


			
	