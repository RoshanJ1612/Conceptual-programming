/*Single level Inheristance
	Philosopy behind the inheristance is reuseability.
	we have to use EXTEND keyword to inherit the class.
*/

import java.lang.*;

class SingleLevelInheristance
{
	public static void main(String[] args)			//entry point function main
	{
		System.out.println("Inside main");
		Derived dobj = new Derived();				// Object of derived class
		dobj.sun();							
		dobj.fun();									//with the help of derived class object here we call base class function this is due to derived class inherits the base class 
		dobj.gun();								
	}

}

class Base
{
	public int i;
	public int j;

	Base()											//Base class constructor
	{
		System.out.println("Inside Base Constructor");
		i = 11;
		j = 21;
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
		System.out.println("Inside Derived Constructor");
		k = 51;
		l = 101;
	}

	public void sun()
	{
		System.out.println("Inside Derived sun");
	}
}

