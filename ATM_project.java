

import java.util.Scanner;


public class ATM_project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pin = 1234;
		int balance = 10000;
		
		int AddAmount = 0;
		int TakeAmount =0;
		
		String name;
		
		Scanner scanner = new Scanner(System.in);
		
		//we have to take an input by an user
		
		System.out.println("Enter your pin number");
		
		int password =scanner.nextInt();
		
		//code arrangement shift+alt +f
		
		if(password == pin)
		{
			
			System.out.println("Enter your Name");
			name = scanner.next();
			System.out.println("welcome" + name);
			
			while (true) {
				
				System.out.println("Press 1 to check your balance");
				System.out.println("Press 2 to add amount");
				System.out.println("Press 3 to take amount");
				System.out.println("Press 4 to take resipt");
				System.out.println("Press 5 to EXIT");
				
				int opt = scanner.nextInt();
				switch(opt)
				{
				   
				case 1:
					System.out.println("your current balance is " + balance);
					break;
					
				case 2:
					System.out.prntln("How much amount did you want to ADD to your account");
					Addamount = scanner.nextInt();
					System.out.println("Successfully credited");
					balance = AddAmount + balance;
					
					//10000 =100 +10000
					//balance = 10100
					break;
				case 3:
					
					System.out.println("How much amount did you want to take");
					TakeAmount = scanner.nextInt();
					if(TakeAmount > balance)
					  {
						System.out.println("your balance is insufficient");
						System.out.println("try less than your available balance");
					  }
					else
					  {
						System.out.println("Successfully taken");
						balance = balance - TakeAmount;
						
						//balance = 10100 =10100 -100
						//balance = 1000
					   }
					 break;
					 
				case 4 :
				
					System.out.println("welcome to all in one mini ATM");
					System.out.println("Available balance is" + balance);
					System.out.println("Amount deposited"     + AddAmount);
					System.out.println("Amount taken        " + TakeAmount);
					System.out.println("Thanks for Coming ");
			   break;
			   
			   
	                default:
	                	System.out.println("press the number below 5");
	                break;	
				    
				}
				if (opt ==5) 
				{
					System.out.println("Thankyou");
					break;
					
				}
			}
			
		}
		else
		{
			
		System.out.println("wrong pin number");	
			
		}
		
		
	}

}
