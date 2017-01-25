
import java.util.Scanner;
/*
Class to count occurrences of each digit in a number
*/
public class CountOccurence1
{
 int number;
 	void accept(){
 		 try {
 			 Scanner sc= new Scanner(System.in);
 			 System.out.println("Enter the number:");
 			 number=sc.nextInt();

		calculate(number);
	} catch (Exception e) {
		
		System.out.println("please enter no less than 10 digit");
	}
 	 }
 	//function to calculate number
 	
 	void calculate(int number) {
		 int count[]=new int[10];
	     for(int i=0;i<10;i++)
	     {
	    	count[i]=0;
	     }
	     int num = 0;
	     while(number>0)
	     {
	    	 num=number%10; 
	    	 count[num]++; 
	    	 number=number/10;
	     }
	    for(int i=0; i<10; i++)
	    {
	    	if(count[i]!=0) {
	    		System.out.println("   "+i+"\t    "+count[i]);
	    	}
	     }
	    
 	}
 	

 	 	
 }