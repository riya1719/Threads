package Threadss;



class go1 implements Runnable
{

	 public void run()
	{
		
		
		
//			for (int i = 1 ; i< 10; i++)
//				System.out.println(i * 5);
		
		
		for (int i = 65 ; i< 91; i++)
			System.out.println((char)i);

	}
}
public class RunnableMethod {

	 public static void main(String[] args)
	{
		
		go1 obj1 = new go1();

		
		
		Thread t1 = new Thread (obj1);
		Thread t2 = new Thread (obj1);
	



		t1.start();
		t2.start();
		


		

		

	}


}
