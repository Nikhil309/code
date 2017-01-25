
/**
 * Class:3 different objects of this class and print those objects.
 */
public class Train 
{
	
	 private String TrainName;
	 private int no_of_tickets;
	 private String class_type;
	 
	 
	 //Constructor
	 public Train() {
		TrainName = null;
		no_of_tickets = 0;
		class_type = null; 
	 }
	 // para constructor
	  public Train(String TrainName, int no_of_tickets, String class_type) {
		this.TrainName = TrainName;
		this.no_of_tickets = no_of_tickets;
		this.class_type = class_type;
	 }

	 //getters
	 public String getTrainName() {
		 return TrainName;
	 }
	 //setter
	 public void setTrainName(String TrainName) {
		 this.TrainName = TrainName;
	 }
	 //getter
	 public int getNo_of_tickets() {
		 return no_of_tickets;
	 }
	 //setter
	 public void setNo_of_tickets(int no_of_tickets) {
		 this.no_of_tickets = no_of_tickets;
	 }
	//getter
	 public String getClass_type() {
		 return class_type;
	 }
	 //setter
	 public void setClass_type(String class_type){
		 this.class_type = class_type;
	 }

	 //@Override Method
	 public String toString() {
		 	return "Train [Trainname=" + TrainName + ", no_of_tickets="
		 			+ no_of_tickets + ", class_type=" + class_type + "]";
	 }


}

	
