// Write a program to input two numbers and find the maximum between 
// two numbers using the conditional/ternary operator.

package practiceQuestions;
import java.util.*;
public class MaxNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		int a = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int b = sc.nextInt();
		
		int result = (a < b) ? b : a;  
		System.out.println("Maximum Between both number is : " + result);
	}

}
