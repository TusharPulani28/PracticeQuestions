//Write a program to check leap year using if else. How to check whether 
//a given year is a leap year or not. [Hint:Take an input of any number.
//Store it in some variable say year. If a year is exactly divisible 
//by 4 and not divisible by 100, then it is a leap year. Or if a year is 
//exactly divisible by 400 then it is a leap year.]

package practiceQuestions;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
			
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the year : ");
				
		int year = sc.nextInt();
				
		// Conditions for checking leap year or not
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("The "+year+ ""+ "th Year is a leap year");
		}else {
			System.out.println("The "+year+ "th year is not a leap year");
			}
	
	}

}

