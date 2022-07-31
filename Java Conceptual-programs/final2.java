import java.lang.*;

class final2
{
	public static void main(String[] args) 
	{
		Derived dobj = new Derived();
		dobj.fun();
		dobj.gun();
	}
}

class Base
{
	public void fun()
	{
		System.out.println("Base fun");
	}


	public final void gun()
	{
		System.out.println("Base gun");
	}

}

class Derived extends Base
{
	public void fun()			//overriding
	{
		System.out.println("Derived fun");
	}

	/*public void gun()			//Not allowed
	{
		System.out.println("Derived gun");
	}*/


}