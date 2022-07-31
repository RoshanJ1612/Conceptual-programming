/*Java BufferedReader class is used to read
the text from a character-based input stream.
It can be used to read data line by line by
readLine() method.
*/

import java.lang.*;
import java.io.*;

class BufferdReaderinput 
{
	public static void main(String[] args) throws  IOException
	{
		
		

	InputStreamReader iobj = new InputStreamReader(System.in);
	BufferedReader bobj = new BufferedReader(iobj);


	System.out.println("Enter the string");
	String str = bobj.readLine();           				//string input
	System.out.println(str);

	System.out.println("Enter the number");
	int no = Integer.parseInt(bobj.readLine());           	//Number input
	System.out.println(no);


	System.out.println("Enter the Float number");
	float fno = Float.parseFloat(bobj.readLine());           	//Float input
	System.out.println(fno);

	System.out.println("Enter the Double number");
	double dno = Double.parseDouble(bobj.readLine());           	//Double input
	System.out.println(dno);
	
	


}
}