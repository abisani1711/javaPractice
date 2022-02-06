//URL: https://www.javatpoint.com/java-program-to-find-the-frequency-of-odd-and-even-numbers-in-the-given-matrix
//Question:Java Program to find the frequency of odd & even numbers in the given matrix

package practiceSimpleProblems;
import java.util.Scanner;
public class FrequencyOfOddAndEvenNumbersInArray {
	
	
	public static void main(String[] args) 
	{
		int i,j,rows, columns, countEven = 0, countOdd = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		rows = sc.nextInt();
		System.out.println("Enter the number of columns");
		columns = sc.nextInt();
		int [][] arr = new int[rows][columns];
		System.out.println("Enter elements:");
		for (i=0;i<columns;i++)
		{
			for (j=0;j<rows;j++)
			{
				
				arr[j][i]= sc.nextInt();
			}
		}
		
		for (i=0;i<columns;i++)
		{
			for(j=0;j<rows;j++)
			{
				if (arr[j][i]%2 == 0)
				{
					countEven++;
				}
				else
				{
					countOdd++;
				}
			}
		}
		
		System.out.println("\nThe final array is:");
		for (i=0;i<columns;i++)
		{
			for (j=0;j<rows;j++)
			{
				System.out.print(arr[j][i] + " ");
			}
			System.out.println("");
		}
			System.out.println("The number of even elements in array are:" + countEven);
			System.out.println("The number of odd elements in array are:" + countOdd);
	}

}
