//URL: https://www.javatpoint.com/java-program-to-find-sum-of-natural-numbers
//Question: Java Program to Find Sum of Natural Numbers

package practiceSimpleProblems;
import java.util.Scanner;
public class SumOfNNaturalNumbers {

	public int naturalNumbersSum(int a)
	{
		int total = 0;
		while(a!=0)
		{
			total = total + a;
			a--;
		}
		return total;
	}
	
	
	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the natural number:");
		n = input.nextInt();
		SumOfNNaturalNumbers sum = new SumOfNNaturalNumbers();
		int totalSum = sum.naturalNumbersSum(n);
		System.out.println("Sum of first " + n + " Natural Numbers is:" + totalSum);
	}

}

/*
Output:
Enter the natural number:
99
Sum of first 99 Natural Numbers is:4950
*/