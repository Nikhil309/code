/*
 * class:- saving class extend account Account to accept & display data
 */

	public class Saving extends Account
	{
		//para constructor
		 public Saving(int id, String name, String address, int phone_no,
		 int account_no) {
			 super(id, name, address, phone_no, account_no);
		 
		 }
		 //default constructor
		 public Saving() {
		 
		 }
		 //refer to superclass method accept
		 void accept() {
			 super.accept();
		 }
		//refer to superclass method display	 
		 void display(){
			 super.display();
		 }

	}

