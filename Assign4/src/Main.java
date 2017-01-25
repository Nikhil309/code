/*
 * class:- Main class
 */
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch1=0;
		do{
			System.out.println("Enter the option:");
			System.out.println("1. Accept Customer Data");
			System.out.println("2. Deposit");
			System.out.println("3. Apply for Loan");
			System.out.println("4. Cash Withdraw");
			int ch=sc.nextInt();
  
		switch(ch){
		case 1:
			Customer customer=new Customer();
			customer.accept();
			break;
		case 2:
			Account ac=new Account();
			ac.deposite();
			break;
		case 3:
			System.out.println("Enter the amount you want the loan on:");
			int lon=sc.nextInt();
			Account ac1=new Account();
			ac1.loan(lon);
			break;
		case 4:
			System.out.println("Enter the amount you want to withdraw:");
			int with=sc.nextInt();
			Account ac2=new Account();
			ac2.withdraw(with);
			break;
		}
		System.out.println("Do you want to continue:");
		int aaa=sc.nextInt();
		}
		while(ch1==0);
 	}
}

