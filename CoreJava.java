//Create a Bank class and declare an instance variable named amount of 
//type double.Create parameterized constructor to initialize variable 
//“amount” with value 10000.Create two methods withdraw(double 
//withdrawalAmount) and deposit(double depositAmount).Calculate withdrawal
//based on some condition (using ternary operator) like If amount 
//is sufficient then “withdraw successful” message will be printed on the 
//console and amount should be updated after withdraw. Later on, 
//deposit 5000 in the account balance.At the end display total balance 
//on the console.

package practiceQuestions;
import java.util.*;
public class CoreJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Bank ob1 = new Bank(15000);
		
		System.out.println("Withdrawal Amount : ");
		double withdrawAmount = sc.nextDouble();
		ob1.withdraw(withdrawAmount);
		
		System.out.println("Deposited Amount : ");
		double depositedAmount = sc.nextDouble();
		ob1.deposit(depositedAmount);
		
		System.out.println("Remaining Balance : " + ob1.amount);
	}

}
class Bank{
	 double amount;
	
	Bank(double amount){
		this.amount = amount;
	}
	
	public void withdraw(double withdrawalAmount){
		String message = (amount > withdrawalAmount) ? "Withdraw Successful" :"Not sufficient Amount" ;
		System.out.println(message);
		amount -= withdrawalAmount;
	}
	
	public void deposit(double depositAmount){
		amount += depositAmount;
		System.out.println("Money Deposited : " + depositAmount);
	}
}
