//Question: Mystery Number in Java
//URL: https://www.javatpoint.com/mystery-number-in-java

package practiceSimpleProblems;
import java.util.Scanner;

public class MysteryNumber {

	public boolean isMysteryNumber(int k)
	{
		int revK = 0;
		int duplicateK = k;
		while(k!=0)
		{
			int a = k%10;
			revK = (10*revK) + a;
			k = k/10;
		}
//		System.out.println(revK);
//		System.out.println(duplicateK+revK);
		if((duplicateK+revK)%11==0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number:");
		n = input.nextInt();
		MysteryNumber obj = new MysteryNumber();
		boolean result = obj.isMysteryNumber(n);
		if(result == true)
		{
			System.out.println("The number is a mystery number");
		}
		else
		{
			System.out.println("The number is not a mystery number");
		}
	}

}
