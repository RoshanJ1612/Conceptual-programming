/*Static 
*/

import java.lang.*;

class staticDemo 
{
	public static void main(String[] args)
	{
		Demo obj = new Demo();				//object creation
		obj.Fun();							//to access non-static characteristics and behaviour we required object of class 
		Demo.gun();							//to access non-static characteristics we required only class name			
	}
}

class Demo
{
	public int i;									//Non-static characteristics
	public int j;
	public static int x;							//static characteristics

	static 										//Static block which get executed before constructor used for intialising static characteristics
	{
		System.out.println("Inside static Block");
		x = 11;
	}

	Demo()										//default constructor
	{
		i = 21;
		j = 51;
	}

	void Fun()									//Non-static behaviour
	{
		System.out.println("Inside demo fun");
		System.out.println(this.i);
		System.out.println(this.j);
		System.out.println(this.x);
	}

	public static void gun()						//static behaviour
	{
		System.out.println("Inside static demo gun");
		//System.out.println(this.i);				//ERROR - we can't access non-static characteristics from the static behaviour
		System.out.println(x);  				

	}

}