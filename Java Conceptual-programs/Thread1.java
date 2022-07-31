/* Thread is consider as the lightweight entity of process
Every process contains atleast one thread in it.

*/

import java.lang.*;

class Thread1
{
	public static void main(String[] args) 
	{
	
	Marvellous mobj1 = new Marvellous();
	Thread t1 = new Thread(mobj1,"First");			//Thread creation

	Marvellous mobj2 = new Marvellous();
	Thread t2 = new Thread(mobj2,"Second");

	t1.start();
	t2.start();
	}
}

class Marvellous extends Thread
{
	public void run()
	{
		System.out.println("Inside Thread "+Thread.currentThread().getName());
	}
}