/*A Wrapper class is a class whose object wraps or 
contains primitive data types. When we create an
object to a wrapper class, it contains a field
and in this field, we can store primitive data
types. In other words, we can wrap a primitive
value into a wrapper class object.

Boxing = converting primitive datatype into corresponding
				wrapper class

Unboxing = converting wrapper class into corresponding 
primitive data type


*/
import java.lang.*;

class Wrapper
{
	public static void main(String[] args)
	{
			
			int no = 11;
			
			Integer iobj = new Integer(11);					

			int i = iobj;												//Unboxing

			Integer iobj2 = no;									//boxing

			System.out.println(no);
			System.out.println(iobj);
			System.out.println(i);
			System.out.println(iobj2);
	}	
}