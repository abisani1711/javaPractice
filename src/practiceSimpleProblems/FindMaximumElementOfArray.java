//Url:https:https://www.javatpoint.com/java-program-to-print-the-largest-element-in-an-array
//Question: Java Program to print the largest element in an array

package practiceSimpleProblems;

import java.util.Scanner;

public class FindMaximumElementOfArray {

	public static void main(String[] args) {
		int i, max;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int m = sc.nextInt();
		int [] a = new int[m];
		for(i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		max = a[0];
		for (i=0;i<a.length-1;i++)
		{
			if(a[i+1]>max)
			{
				max = a[i+1];
			}
		}

		System.out.println("The largest number in array is:");
			System.out.print(max);
		
	}

}
