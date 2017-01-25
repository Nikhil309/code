/*
 /* class:- Account class accept and display data
 */
import java.util.Scanner;


	public class Account extends Customer
{
		Scanner sc=new Scanner(System.in);
		static private int balance=1000;
		private int bal;
		Account(){
  
		}
		//getter
		public int getBal() {
				return bal;
		}
		//setter
		public void setBal(int bal) {
				this.bal = bal;
		}
		//parameter constructor
		public Account(int id, String name, String address, int phone_no,
				int account_no) {
				super();
		}
		private int id;
		private int  cust_id;
		//function to accept Id and customer Id
		void accept(){ 
				System.out.println("Enter ID:");
				id=sc.nextInt();
				System.out.println("Enter Cust ID:");
				cust_id=sc.nextInt();
		}
		//function to display Id and Customer Id
		void display(){
				System.out.println("Account ID:"+id);
				System.out.println("Cust_ID:"+cust_id);
		}
		//function to deposite the balance
		void deposite(){
				System.out.println("Enter the amount to deposite:");
				bal=sc.nextInt();
				balance=bal+balance;
				System.out.println("Balance:"+balance);
				setBal(balance);
		}
		// function to calculate loan
		void loan(int bal){
				float amount= (float) (bal*12*5)/100;
				System.out.println("Amount:"+amount);
		}
		//function to withdraw money 
		void withdraw(int with){
			if(balance<=1000){
				System.out.println("The amount can't be dispense");
		}
			else {
				balance=balance-with;
				System.out.println("The amount dispense:"+with);
				System.out.println("The amount remaining:"+balance);
		}
 }
}