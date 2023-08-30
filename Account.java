import java.util.Scanner;

public class Account {
	
   private int customerNumber;
   private int pinNumber;
   private double checkingBalance = 0;
   private double savingBalance = 0;
   
   Scanner sc = new Scanner(System.in);
   
   public int setCustomerNumber(int cn) {
	   this.customerNumber = cn;
	   return customerNumber;
   }
   
   public int getCustomerNumber() {
	   return customerNumber;
   }
   
   public int setPinNumber(int pin) {
	   this.pinNumber = pin;
	   return pinNumber;
   }
   
   public int getPinNumber() {
	   return pinNumber;
   }
   
   public double getCheckingBalance() {
	   return checkingBalance;
   }
   
   public double getSavingBalance() {
	   return savingBalance;
   }
   
   public double calcCheckingWithdraw(double amount) {
	   checkingBalance = checkingBalance-amount;
	   return checkingBalance;
   }
   
   public double calcSavingWithdraw(double amount) {
	   savingBalance = savingBalance-amount;
	   return savingBalance;
   }
   
   public double calcCheckingDeposit(double amount) {
	   checkingBalance = checkingBalance + amount;
	   return checkingBalance;
   }
   
   public double calcSavingDeposit(double amount) {
	   savingBalance = savingBalance + amount;
	   return savingBalance;
   }
   
   public void getCheckingWithdrawInput() {
	   
	   System.out.println("Checking Account Balance: "+ checkingBalance);
	   System.out.println("Enter the amount you want to withdraw from Checking Account: ");
	   double amount = sc.nextInt();
	   
	   if((checkingBalance - amount) >= 0) {
		   calcCheckingWithdraw(amount);
		   System.out.println("New Checking Account Balance: "+ checkingBalance);
	   } else {
		   System.out.println("Insufficient Balance.");
	   }
   
   }
   
   public void getSavingWithdrawInput() {
	 
	   System.out.println("Saving Account Balance: "+ savingBalance);
	   System.out.println("Enter the amount youe want to withdraw from Saving Account: ");
	   double amount = sc.nextInt();
	   
	   if((savingBalance - amount) >= 0) {
		   calcSavingWithdraw(amount);
		   System.out.println("New Saving Account Balance: "+ savingBalance);
	   } else {
		   System.out.println("Insufficient Balance.");
	   }
   
   }
   
   public void getCheckingDepositInput() {
	
	   System.out.println("Checking Account Balance: "+ checkingBalance);
	   System.out.println("Enter the amount you want to Deposit to your Checking Account: ");
	   double amount = sc.nextInt();
	   
	   if((checkingBalance + amount) >= 0) {
		   calcCheckingDeposit(amount);
		   System.out.println("New Checking Account Balance: "+ checkingBalance);
	   } 
//	   else {
//		   System.out.println("Balance cannot be Negative"+"/n");
//	   }
   }
   
   public void getSavingDepositInput() {
	
	   System.out.println("Saving Account Balance: "+ savingBalance);
	   System.out.println("Enter the amount you want to Deposit to Saving Account: ");
	   double amount = sc.nextInt();
	   
	   if((savingBalance + amount) >= 0) {
		   calcSavingDeposit(amount);
		   System.out.println("New Saving Balance: "+ savingBalance);
	   } 
	   else {
		System.out.println("Balance cannot be Negative."+"\n");   
	   }
   }

}
