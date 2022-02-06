//URL: https://www.javatpoint.com/java-program-to-find-the-sum-of-each-row-and-each-column-of-a-matrix
//Question: Java Program to find the sum of each row and each column of a matrix

package practiceSimpleProblems;

import java.util.Scanner;

public class SumOfEachRowAndColumnOfAMatrix 
{

	public static void main(String[] args) 
	{
		int i,j,rows, columns;
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
		
		System.out.println("\nThe final array is:");
		for (i=0;i<columns;i++)
		{
			for (j=0;j<rows;j++)
			{
				System.out.print(arr[j][i] + " ");
			}
			System.out.println("");
		}
		
		for(i = 0; i<columns;i++)
		{	int sum = 0;
			for(j = 0;j<rows; j++)
			{
				sum = sum + arr[j][i];
			}
			System.out.println("The sum of row " + (i+1) + " is " +sum);
		}
		
		for(j = 0;j<rows; j++)
		{	int sum = 0;
			for(i = 0; i<columns;i++)
			{
				sum = sum + arr[j][i];
			}
			System.out.println("The sum of column " + (j+1) + " is " +sum);
		}
	}

}
