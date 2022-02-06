//Question: Palindrome Program in Java
//URL: https://www.javatpoint.com/palindrome-program-in-java

package practiceSimpleProblems;
import java.util.Scanner;
public class PalindromeNumber 
{

	public static void main(String[] args)
	{
		int copyOfInputNumber, n = 0, n1;
		Scanner sc = new Scanner(System.in);
		int inputNumber = sc.nextInt();
		copyOfInputNumber = inputNumber;
		while(copyOfInputNumber!=0)
		{
			n1 = copyOfInputNumber % 10;
			n = n*10+n1;
			copyOfInputNumber = copyOfInputNumber /10;
		}
		
		if (inputNumber == n)
		{
			System.out.println(inputNumber + " is a palindrome number");
		}
		else
		{
			System.out.println(inputNumber + " is not a palindrome number");
		}
	}
}
