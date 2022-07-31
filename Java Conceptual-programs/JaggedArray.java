/*A jagged array is an array of arrays such
that member arrays can be of different sizes, 
i.e., we can create a 2-D array but with a
variable number of columns in each row.
These types of arrays are also known as Jagged arrays. */

import java.lang.*;
import java.util.Scanner;

class JaggedArray
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);

		// Declaring 2-D array with 3 rows
		int arr[][] = new int[3][];

		//Making above 2-D aary jagged

		// First row has 3 columns
		   arr[0] = new int[3];

		// Second row has 2 columns
		   arr[1] = new int[2];

		// third row has 3 columns
		   arr[2] = new int[3];

		 System.out.println("Please enter the value");  
		//Accepting the value from the user
		for(int i = 0;i<arr.length;i++)
		{
			for(int j = 0; j<arr[i].length;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}  

		System.out.println("Array element are:");
		//Displaying the value of jagged array
		for(int i = 0;i<arr.length;i++)
		{
			for(int j = 0; j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}    





	}	
}