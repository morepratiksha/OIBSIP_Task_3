package atm_interface;

import java.util.Scanner;

public class Atm_interface {
	public static void main(String[] args)
	 {

		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------------WELCOME TO ABC BANK------------------------");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("---------------------------------LOGIN-------------------------------");
		
		System.out.print("Enter User ID :");
		String user_id = sc.next();
		System.out.print("Enter User Pin :");
		String pass = sc.next();
		{
				System.out.println("------------------- LOGIN SUCCESSFULL------------------------");
				Features();
	}
	 }
	
	public static void Features() {
		
		
		final int BUTTON = 5;

		
		Scanner sc = new Scanner(System.in);

		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Press 1 to TRANSACTION HISTORY");
		System.out.println("Press 2 to WITHDRAW");
		System.out.println("Press 3 to DEPOSITE");
		System.out.println("Press 4 to FUND TRANSFER");
		System.out.println("Press 5 to QUIT ");
		int button = sc.nextInt();
		switch (button) {
			case 1 -> {
				System.out.println("01 Nov 2023   Rent                                  -500");
				System.out.println("04 Nov 2023   Transport                             -200");
				System.out.println("09 Nov 2023   Shopping                              -500");
				System.out.println("10 Nov 2023   Grocery                               -220");
				System.out.println("13 Nov 2023   Family                               +5500");
				System.out.println("17 Nov 2023   Food                                   -50");
				System.out.println("19 Nov 2023   Grocery                              -2050");
				System.out.println("22 Nov 2023   Cash withdraw                         -700");
				System.out.println("25 Nov 2023   Transfer                              -500");
				System.out.println("25 Nov 2023   Family                                +500");
				System.out.println("27 Nov 2023   Education                             -500");
				System.out.println("29 Nov 2023   Donations                             -300");
				System.out.println("30 Nov 2023   Medical Expenses                      +700");
				System.out.println("31 Nov 2023   Lifestyle                             +100");
				Scanner sc3 = new Scanner(System.in);
				System.out.println("\nPress 1 to Exit");
				System.out.println("Press 2 to go back to Home page");
				String deposite=sc3.nextLine();
				if(deposite.equalsIgnoreCase("1"))
			    {System.out.println("\nThank you for choosing ABC Bank!!");
		    	System.exit(0);
		        }
				else if(deposite.equalsIgnoreCase("2"))
			    {Features();
		        }
			}
				
				
		
			
case 2 -> {
	
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Enter amount to withdraw");
	int amount =sc.nextInt();
	System.out.println("Enter Pin");
	int pin =sc.nextInt();
	System.out.println("Please wait!");
	System.out.println("You can collect your CASH and TRANSACTION RECIPT.");

	System.out.println("Thank you for choosing ABC Bank!!");
	Scanner sc3 = new Scanner(System.in);
	System.out.println("\nPress 1 to Exit");
	System.out.println("Press 2 to go back to Home page");
	String deposite=sc3.nextLine();
	if(deposite.equalsIgnoreCase("1"))
    {System.out.println("\nThank you for choosing ABC Bank!!");
	System.exit(0);
    }
	else if(deposite.equalsIgnoreCase("2"))
    {Features();
    }
			}
case 3 -> {
	Scanner sc1 = new Scanner(System.in);
	
	System.out.println("Insert the cash in the deposite slot below");
	System.out.println("Enter amount to Deposite");
	int amount1 =sc.nextInt();
	System.out.println("Press 1 to confirm the amount");
	Scanner sc2 = new Scanner(System.in);

	String amount11=sc2.nextLine();
	if(amount11.equalsIgnoreCase("1"))
    {
	        {System.out.println("\nCash Deposited successfully.");
	        System.out.println("Please collect your TRANSACTION RECIPT.");
	        System.out.println("\nPress 1 to Exit");
			System.out.println("Press 2 to go back to Home page");

			Scanner sc3 = new Scanner(System.in);
			
			String deposite=sc3.nextLine();
			if(deposite.equalsIgnoreCase("1"))
		    {System.out.println("\nThank you for choosing ABC Bank!!");
			System.exit(0);
		    }
			else if(deposite.equalsIgnoreCase("2"))
		    {Features();
		    }
	        }
	        }
	 else
     {
         System.out.println("\n\n!!! INVALID INPUT !!! \n\n");
         System.exit(0);
     }


}
case 4 -> {
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Enter the beneficiary's bank name");
	String name =sc1.nextLine();
	System.out.println("Enter the beneficiary's account number");
	int accno =sc1.nextInt();
	System.out.println("Enter the amount to be transfered");
	int amount3 = sc1.nextInt();
	System.out.println("Press 1 to confirm the details entered");
	Scanner sc2 = new Scanner(System.in);

	String amount11=sc2.nextLine();
	if(amount11.equalsIgnoreCase("1"))
    {
	        {System.out.println("\nTRANSFER successfull.");
	        System.out.println("Please collect your TRANSACTION RECIPT.");
	        System.out.println("\nPress 1 to Exit");
			System.out.println("Press 2 to go back to Home page");

			Scanner sc3 = new Scanner(System.in);
			
			String deposite=sc3.nextLine();
			if(deposite.equalsIgnoreCase("1"))
		    {System.out.println("\nThank you for choosing ABC Bank!!");
			System.exit(0);
		    }
			else if(deposite.equalsIgnoreCase("2"))
		    {Features();
		    }
	        }
	        }
	 else
     {
         System.out.println("\n\n!!! INVALID INPUT !!! \n\n");
     }
	
    }

case 5 -> {
	System.out.println("You are logged out");
	System.out.println("\nThank you for choosing ABC Bank!!");

	
}
	
			default -> {
				System.out.println(" ------------------------INCORRECT INPUT------------------------- ");
				System.out.println("------------------------------------------------------------------");
			}
		}
			
		
			
	}
}

