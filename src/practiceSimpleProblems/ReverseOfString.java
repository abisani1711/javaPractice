//URL: https://www.javatpoint.com/java-program-to-find-reverse-of-the-string
//Question: Java Program to find Reverse of the string

package practiceSimpleProblems;
import java.util.*;

public class ReverseOfString {

	public static void main(String[] args)
	{
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
			s = sc.nextLine();
		
		System.out.println("\n");
		System.out.println("The reverse of the string is:");
		for (int i = s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}
}

/*
Output:

Enter string:
Aayush is a student


The reverse of the string is:
tneduts a si hsuyaA
*/