//Question 1: Write code to determine if the string is a palindrome.
//
//	  Input String : Madam 
//	 Output : Madam is a Palindrome

package practiceQuestions;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your string: ");
		String s = sc.next();
		
//		Call the method and print the output
		System.out.println(palindrome(s));
		
	}

//   Palindrome Method
	public static String palindrome(String s) {
		int firstChar = 0;
		int lastChar = s.length()-1;
		
		while(firstChar < lastChar) {
			if(s.charAt(firstChar) != s.charAt(lastChar)) {
				return s + " is not a palindrome";
				
			}
			firstChar++;
			lastChar--;
		}
		return s + " is a palindrome";
		
	}
}
