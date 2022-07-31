/*Super keyword  in java
1)this concept is not applicable in the C++
2)By using the super keyword we can access the 
non-private member of base class from the derived 
class.
3)We can use super keyword for-
  i)To access the characteristics of the base class
  ii)to call behaviour of base class
  iii) to call constructor of base class explicitely.
  */

import java.lang.*;

class Super
{
	public static void main(String[] args)			//entry point function main
	{
		System.out.println("Inside main");
		Derived dobj = new Derived();				// Object of derived class
		dobj.sun();							
										
	}

}

class Base
{
	public int i;
	public int j;

	Base()											//Base class default constructor
	{
		System.out.println("Inside Base Constructor");
		this.i = 11;
		this.j = 21;
	}

	Base(int a,int b)											//Base class parameterise constructor
	{
		System.out.println("Inside Base Constructor");
		this.i = a;
		this.j = b;
	}

	public void fun()
	{
		System.out.println("Inside Base Fun");
	}

	public void gun()
	{
		System.out.println("Inside Base Gun");
	}

}

class Derived extends Base 						//Derived class inherites Base class
{
	public int k;
	public int l;

	Derived()									//Derived class constructor
	{
		super(51,101);							//Calling the base class constructor explicitely
		System.out.println("Inside Derived Constructor");
		this.k = 51;
		this.l = 101;
	}

	public void sun()
	{
		System.out.println("Inside Derived sun");
		System.out.println(super.i);				//with the super keyword we access the base class characteristics
		super.fun();								//with the super keyword we call the base class function
	}
}


