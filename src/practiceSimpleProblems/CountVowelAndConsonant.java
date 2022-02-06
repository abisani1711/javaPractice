//Url: https://www.javatpoint.com/java-program-to-count-the-total-number-of-vowels-and-consonants-in-a-string
//Question: Java Program to count the total number of vowels and consonants in a string

package practiceSimpleProblems;
import java.util.Scanner;
public class CountVowelAndConsonant {

	
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		int countVowel = 0, countConsonant = 0;
		for(int i = 0; i<s.length();i++)
		{
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
			{
				countVowel++;
			}
			else
			{
				countConsonant++;
			}
		}
		System.out.println("Number of vowels: " + countVowel + " Number of consonants:" + countConsonant);
	}

}
//Output
//Photosynthesis
//Number of vowels: 4 Number of consonants:10