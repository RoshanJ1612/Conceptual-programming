import java.lang.*;

class final3
{
	public static void main(String[] args)
	{
		Derived dobj = new Derived();
		dobj.bobj.fun();
		dobj.gun();

	}
	
}

final class Base
{
	public void fun()
	{
		System.out.println("Base fun");
	}
}

class Derived			//composition
{
	public Base bobj = new Base();

	public void gun()
	{
		System.out.println(" Derived gun");
	}
}

