package Threadss;


class Notify1 extends Thread   
{  
    public void run()  
    {  
        synchronized(this)  
        {  
            System.out.println("Starting of " + Thread.currentThread().getName());  
            try {  
                this.wait();  
            }  
            catch (InterruptedException e) {  
                e.printStackTrace();}  
            System.out.println(Thread.currentThread().getName() + "...notified");  
        }  
    }  
}  

class go5 extends Thread 
{

	 public void run() 
	{
		 try
		 {
			 wait();
			 for (int i = 0 ; i< 20; i++)
					System.out.println(i);
			
			 
		 }
		
		 catch (Exception e)
		 {
			
		 }
		 
		
		 for (int i = 65 ; i< 91; i++)
				System.out.println((char)i);
			 
			 notify();
		
		

	}
}



public class wait {
	
	public static void main(String[] args) throws InterruptedException  
	{
          go5 obj1 = new go5();

		
		Thread t1 = new Thread (obj1);
	



		t1.start();
	}

}
