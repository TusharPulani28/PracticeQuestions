//Declare an array with 10 elements. Get a subArray from an array 
//between index 2 to 6 and find out the 2nd highest number from the 
//sub array.
//		  Input: 2 4 5 3 6 7 9 4 5 6
//		 Output:
//		       Sub array: 5 3 6 7 9
//		       2nd Highest element: 7

package practiceQuestions;

import java.util.Scanner;

public class SecondHighest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		// Declare an array and a SubArray
		int [] arr = new int[10];
		int [] subArr = new int[5];
			
		// store the elements in an array and SubArray
		for(int i = 0 ; i < 10; i++) {
			System.out.print("Enter the " + i +"th element : ");
			arr[i] = sc.nextInt();
		}
		for(int i = 0 ; i < 5 ; i++) {
			subArr[i] = arr[i+2];
		}
		System.out.println("SubArray : ");
		
		// Printing the SubArray
		for(int ele : subArr) {
			System.out.print(ele + " ");
		}
			
		System.out.println();
		System.out.println("2nd Highest element : " + secondHighest(subArr) );
		}

		// Method for finding secondHighest in an array
		private static int secondHighest(int [] newArr) {
			for(int i = 0 ; i < newArr.length; i++) {
				for(int j = i + 1; j < newArr.length; j++) {
					if(newArr[i] > newArr[j]) {
						// Swapping
						int temp = newArr[i];
						newArr[i] = newArr[j];
						newArr[j] = temp;
					}
				}
			}
			return newArr[newArr.length-2];
		}
	}
