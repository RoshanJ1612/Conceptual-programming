/*	Constructor 
		Constructor is a user defined function which get implicitely called 
		by compiler when we create the object of the class.
		In java there are two typews of constructor
		1)Deafault Constructor(No parameter is accepted)
		2)Parameterised Constructor(Parameter is accepted)
*/


import java.lang.*;

public class Constructor
{
	public static void main(String[] args)			//Entry point function
	{
		System.out.println("Inside main");
		Base bobj = new Base();						//object Creation
		Base bobj1 = new Base(51,111);

		bobj.fun();
		System.out.println(bobj.i);
		
		bobj1.gun();
		System.out.println(bobj1.j);
	}
	
}


class Base
{
	int i;			//Characteristic
	int j;			//Characteristic

	Base()			//Default Constructor of Base class 	
	{
		i = 11;
		j = 21;
	}

	Base(int a,int b)		//Parameterised constructor of base class
	{
		i = a;
		j = b;
	}


	public void fun()				//behaviour(Method) of base class
	{
		System.out.println("Inside base fun");
	}

	public void gun()				//behaviour(Method) of base class
	{
		System.out.println("Inside base gun");
	}


}

