// Question: Prime Number Program in Java
// URL: https://www.javatpoint.com/prime-number-program-in-java



package practiceSimpleProblems;
import java.util.*;
public class PrimeNumber {
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number greater than 1:");
		int n = sc.nextInt();
		
		int n1;
		int count=0;
		n1 = n;
			
		
		while(n1 >0){
			if (n%n1 == 0)
			{
				count++;
			}
			n1--;
		}
		
		
			if(count<=2)
			{System.out.println("The number " + n + " is a prime number");}
			else if(count>2)
			{System.out.println("The number "+ n + " is not a prime number");}
		}
	}

