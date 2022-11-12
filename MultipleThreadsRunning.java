package Threadss;

public class MultipleThreadsRunning 
{
	public static void main(String[] args)
	   {
		
		char x = '0';
		System.out.println(x);
		run();
	      b obj = new b ();
	      obj.run(); 
	   }
	
	public static void  run ()

	{
		System.out.println("parent");	
	}
	
     void main()
	{
		
	}
}

class b extends MultipleThreadsRunning
{
	public static void run ()
	{
		System.out.println("child");
		boolean flag = true;
		int [] a []= new int [5][];
		
		
	}
	
}
