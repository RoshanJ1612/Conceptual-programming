/*Java BufferedReader class is used to read
the text from a character-based input stream.
It can be used to read data line by line by
readLine() method.
*/

import java.lang.*;
import java.io.*;

class BufferdReaderinput
{
	public static void main(String[] args)
	{
		
	
	InputStreamReader iobj = new InputStreamReader(System.in);
	BufferdReader bobj = new BufferReader(iobj);


	System.out.println("Enter the string");
	String str = bobj.readLine();

	System.out.println(str);
}
}