import java.io.*;

class StringXXXX
{
	public static void main(String[] args) {
		int i  = 0;
		String str = new String("Hello");
		StringBuffer str2 = new StringBuffer("Hello");
		StringBuilder str3 = new StringBuilder("Hello");

		System.out.println(str);
		System.out.println(str.length());

		System.out.println(str2);
		System.out.println(str2.length());

		System.out.println(str3);
		System.out.println(str3.length());
	}
}