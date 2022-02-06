//URL: https://www.javatpoint.com/java-program-to-find-reverse-of-the-string
//Question: Java Program to find Reverse of the string

package practiceSimpleProblems;
import java.util.*;

public class ReverseOfString {

	public static void main(String[] args)
	{
		String s;
		Scanner sc = new Scanner(System.in);
			s = sc.nextLine();
		
		for(int i = 0; i<s.length();i++)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println("\n");
		for (int i = s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}
}
