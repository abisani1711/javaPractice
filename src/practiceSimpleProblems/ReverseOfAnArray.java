//Url: https://www.javatpoint.com/java-program-to-print-the-elements-of-an-array-in-reverse-order
//Question: Java Program to print the elements of an array in reverse order


package practiceSimpleProblems;
import java.util.*;
public class ReverseOfAnArray {

	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int m = sc.nextInt();
		int [] a = new int[m];
		for(i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("The array is:");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println("\n");
		System.out.println("The reverse of the array is:");
		for(i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i] + " ");
		}
	}

}
