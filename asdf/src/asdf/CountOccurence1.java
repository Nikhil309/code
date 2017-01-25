package asdf;

	import java.util.Scanner;


	public class CountOccurence1 
	{
	 int number;

	 void accept()
	 {
	  
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter the number:");
	  number=sc.nextInt();
	  calculate(number);
	  //System.out.println(number);
	 }

	 void calculate(int number)
	 {
	  
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
	         
	              if(count[i]!=0) 
	              System.out.println("   "+i+"\t    "+count[i]);
	         }
	     
	 }

	}

