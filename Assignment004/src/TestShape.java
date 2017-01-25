
import java.util.Scanner;

	public class TestShape
	{

	  public static void main(String[] args)
	  {
	   Scanner sc=new Scanner(System.in);  
	 
	   Triangle t=new Triangle();
	 
	   Rectangle r=new Rectangle();

	double width=0.0, length=0.0;


	  System.out.println("Rectangle Enter the width " );
	   width=sc.nextInt();
	  System.out.println("Rectangle Enter the length");
	   length=sc.nextInt();

	    r.area();

	double x =0.0, y = 0.0, z= 0.0;



	  System.out.println("Triangle Enter length");
	   x=sc.nextInt();
	  System.out.println("Triangle Enter breadth");
	   y=sc.nextInt();
	  System.out.println("Triangle Enter heigth");
	   z=sc.nextInt();
	    
	   t.area();
	  }
	}


