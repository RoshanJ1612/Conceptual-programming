import java.lang.*;

class Inheristance2
{
	
	public static void main(String ars[])
	{
		System.out.println("Inside main");
		Derived dobj = new Derived();
		dobj.sun();


	}
}

class Base
{
	public int i;
	public int j;

	public Base(int a,int b)
	{
		this.i = a;
		this.j = b;
	}
	public void fun()
	{
		System.out.println("Inside Base fun");
		
	}

}

class Derived extends Base 
{
	public int x;
	public int y;

	public Derived()
	{
		super(11,21);
		System.out.println("Inside Derived constructor");
		this.x = 30;
		this.y = 40;
	}

	public void sun()
	{
		System.out.println("Inside derived sun");
		System.out.println(super.i);		//1
		super.fun();			//2
	}
}
