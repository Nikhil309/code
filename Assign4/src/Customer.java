/*
 * class:- Customer detail 
 */
import java.util.Scanner;


public class Customer {
		private int id;
		private String name;
		private String address;
		private String phone_no; 	 	
		private String account_no;
 
 
		Customer()
		{
  
		}
		//para constructor
		public Customer(int id, String name, String address, String phone_no,
			String account_no) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
			this.phone_no = phone_no;
			this.account_no = account_no;
		}
		//para construtor
		public Customer(int id, String name, String address, String phone_no,
			String account_no, Current current) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
			this.phone_no = phone_no;
			this.account_no = account_no;
  
		}
 
		//fun to accept the customer details
		void accept(){
			Scanner sc=new Scanner(System.in); 
			System.out.println("Enter ID:");
			id=sc.nextInt();
			System.out.println("Enter Name:");
			name=sc.next();
			System.out.println("Enter Address:");
			address=sc.next();
			System.out.println("Enter Phone_no");
			phone_no=sc.next();
			if(phone_no.length()==10){
				System.out.println("Valid no");
				//while(!(phone_no.length()==10))
				//{
					phone_no=sc.next();
				//}
			}
			else{
				System.out.println("Invalid no");
			}
			
			System.out.println("Enter Account:");
			account_no=sc.next();
			System.out.println("Enter the account:(Saving Account/Current Account)");
			System.out.println("1.Saving Account ");
			System.out.println("2.Current Account ");
			int ch=sc.nextInt();
			if(ch==1)
			{
				Saving ss=new Saving();
				ss.accept();
				display();
				ss.display();
			}
			else
			{
				Current cc=new Current();
				cc.accept();
				display();
				cc.display();
			}
		}
		//fun to display the customer details
		void display() {
			System.out.println("ID:"+id);
			System.out.println("Name:"+name);
			System.out.println("Address:"+address);
			System.out.println("Phone_No:"+phone_no);
		
		}

}