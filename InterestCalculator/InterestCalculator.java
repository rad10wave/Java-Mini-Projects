package new_project;
import java.util.Scanner;

abstract class Account {
    double interestRate;
    double amount; 
    abstract double calculateInterest(double amount);
}

class FDaccount extends Account {
    double interestRate;
    double amount;
    int noOfDays;
    int age;
    
    Scanner input=new Scanner(System.in);
    
    
	@Override
	double calculateInterest(double amount) {
		double General=0, S_citizen=0;
		this.amount=amount;
		
		System.out.println("Enter days");
        noOfDays = input.nextInt();
        
        System.out.println("Enter age holder ");
        age = input.nextInt();
        
        //for less than 1 crore
        if (amount < 10000000) {
            if (noOfDays >= 7 && noOfDays <= 14) {
                General = 0.0450;
                S_citizen = 0.0500;
            } else if (noOfDays >= 15 && noOfDays <= 29) {
                General = 0.0470;
                S_citizen = 0.0525;
            } else if (noOfDays >= 30 && noOfDays <= 45) {
                General = 0.0550;
                S_citizen = 0.0600;
            } else if (noOfDays >= 45 && noOfDays <= 60) {
                General = 0.0700;
                S_citizen = 0.0750;
            } else if (noOfDays >= 61 && noOfDays <= 184) {
                General = 0.0750;
                S_citizen = 0.0800;
            } else if (noOfDays >= 185 && noOfDays <= 365) {
                General = 0.0800;
                S_citizen = 0.0850;
            }
            interestRate = (age < 50) ? General : S_citizen;
        } 
        
        //for more than 1 crore
        else {
            if (noOfDays >= 7 && noOfDays <= 14) {
                interestRate = 0.065;
            } else if (noOfDays >= 15 && noOfDays <= 29) {
                interestRate = 0.0675;
            } else if (noOfDays >= 30 && noOfDays <= 45) {
                interestRate = 0.00675;
            } else if (noOfDays >= 45 && noOfDays <= 60) {
                interestRate = 0.080;
            } else if (noOfDays >= 61 && noOfDays <= 184) {
                interestRate = 0.0850;
            } else if (noOfDays >= 185 && noOfDays <= 365) {
                interestRate = 0.10;
            }
        }
        return amount * interestRate;	
		// TODO Auto-generated method stub		
	}
}


class SBaccount extends Account{
double interestRate;
double amount;
Scanner input=new Scanner(System.in);
	@Override
	double calculateInterest(double amount) {
		 this.amount = amount;
	        System.out.println("Select account type \nPress 1 for NRI \nPress 2 for Normal ");
	        int accountChoice = input.nextInt();
	        switch (accountChoice) {
	            case 1:
	                interestRate = .06;
	                break;
	            case 2:
	                interestRate = .04;
	                break;
	            default:
	                System.out.println("Not a vaild input");
	                
	        }
	     return amount * interestRate;
		// TODO Auto-generated method stub
	
	}
	
}


class RDAccount extends Account{
	double interestRate;
	double amount;
	int noOfMonths;
	double monthlyAmount;
	 Scanner RDScanner = new Scanner(System.in);
	@Override
	double calculateInterest(double amount) {
		double General=0, SCitizen=0;
		this.amount = amount;
        System.out.println("Enter months");
        noOfMonths = RDScanner.nextInt();
        System.out.println("Enter holder age");
        int age = RDScanner.nextInt();
		
		if (noOfMonths >= 0 && noOfMonths <= 6) {
            General = .0750;
            SCitizen = 0.080;
        } else if (noOfMonths >= 7 && noOfMonths <= 9) {
            General = .0775;
            SCitizen = 0.0825;
        } else if (noOfMonths >= 10 && noOfMonths <= 12) {
            General = .0800;
            SCitizen = 0.0850;
        } else if (noOfMonths >= 13 && noOfMonths <= 15) {
            General = .0825;
            SCitizen = 0.0875;
        } else if (noOfMonths >= 16 && noOfMonths <= 18) {
            General = .0850;
            SCitizen = 0.0900;
        } else if (noOfMonths >= 22) {
            General = .0875;
            SCitizen = 0.0925;
        }
        interestRate = (age < 50) ? General : SCitizen;
        return amount * interestRate;
		// TODO Auto-generated method stub
		
	}
	
}
public class InterestCalculator {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
        System.out.println("\n\nSelect the option:\n " + "\nPress 1 for Interest Calculator(SB)" + 
        		" \nPress 2 for Interest Calculator(FD)"
                + "\nPress 3 for InterestCalculator(RD)" + "\nPress 4 to Exit");
        choice = sc.nextInt();
        switch (choice) {
        case 1:{
        		SBaccount sb = new SBaccount();
                System.out.println("Enter the Average  amount ");
                double amount = sc.nextDouble();
                System.out.println("Interest gained : Rupees " + sb.calculateInterest(amount));
        	break;
        }
        case 2:{
        	FDaccount fd = new FDaccount();
            System.out.println("Enter the Average  amount ");
            double amount = sc.nextDouble();
            System.out.println("Interest gained : Rupees " + fd.calculateInterest(amount));
        	break;
        }
        case 3:{
        	RDAccount rd = new RDAccount();
            System.out.println("Enter the Average  amount ");
            double amount = sc.nextDouble();
            System.out.println("Interest gained : Rupees " + rd.calculateInterest(amount));
        	break;
        }
        	
        
        }
        }
        while(!(choice==4));		
		sc.close();
        }

}
