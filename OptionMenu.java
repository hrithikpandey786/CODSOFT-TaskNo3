
import java.io.IOException;
import java.util.*;

public class OptionMenu extends Account{
  Scanner sc = new Scanner(System.in);
  HashMap<Integer, Integer> data = new HashMap<>();
  
  public void getLogin() throws IOException{
	  
	  int x=1;
	  
	  do {
		  try {
			  data.put(12345, 1552);
			  data.put(67890, 2551);
			  
			  System.out.println("Welcome to the ATM");
			  System.out.println("Enter your Customer Number");
			  setCustomerNumber(sc.nextInt());
			  
			  System.out.println("Enter your PIN Number");
			  setPinNumber(sc.nextInt());
		  }    
		   catch(Exception io) {
			  System.out.println("Invalid Character. Please enter only Numbers.");
			  x=2;
		  }
       
		  int cn = getCustomerNumber();
		  int pn = getPinNumber();
		  
		  if(data.containsKey(cn) && data.get(cn) == pn) {
			  getAccountType();
		  } else System.out.println("Wrong Customer Number or PIN Number");
      } while(x == 1);
   
  }
  
  public void getAccountType() {
	
	  System.out.println("Enter your Choice");
	  System.out.println("Type 1: Checking Account");
	  System.out.println("Type 2: Saving Account");
	  System.out.println("Type 3: Exit");
	  
	  int selection = sc.nextInt();
	  
	  switch(selection){
		  case 1: 
			  getChecking();
		      break;
		  
		  case 2:
			  getSaving();
			  break;
		  
		  case 3:
			  System.out.println("Thanks for visiting. \n Please visit again.");
			  break;
			  
		  default:
			  System.out.println("Enter valid Options");
	   }
  }
  
  public void getChecking() {
	  
	  System.out.println("Checking Account: ");
	  System.out.println("Type 1 - Check Balance");
	  System.out.println("Type 2 - Withdraw Funds");
	  System.out.println("Type 3 - Deposit Funds");
	  System.out.println("Type 4 - Exit");
	  System.out.println("Choice");
	  
	  int selection = sc.nextInt();
	  
	  switch(selection) {
	  
	  case 1:
		  System.out.println("Checking Account Balance: " + getCheckingBalance());
		  getAccountType();
		  break;
		  
	  case 2:
		  getCheckingWithdrawInput();
		  getAccountType();
		  break;
		  
	  case 3:
		  getCheckingDepositInput();
		  getAccountType();
		  break;
		  
	  default:
		  System.out.println("Enter valid options.");
		  
	  }
  }
  
  public void getSaving() {
	  
	  System.out.println("Saving Account: ");
	  System.out.println("Type 1 - View Balance");
	  System.out.println("Type 2 - Withdraw Funds");
	  System.out.println("Type 3 - Deposit Funds");
	  System.out.println("Type 4 - Exit");
	  System.out.println("Choice: ");
	  
	  int selection = sc.nextInt();
	  
	  switch(selection) {
	  
	  case 1:
		  System.out.println("Saving Account Balance: "+ getSavingBalance());
		  getAccountType();
		  break;
		  
	  case 2:
		  getSavingWithdrawInput();
		  getAccountType();
		  break;
		  
	  case 3:
		  getSavingDepositInput();
		  getAccountType();
		  break;
		  
	  default:
		  System.out.println("Enter valid options.");
	  }
  }
  
}
