/*
 * Class: Base class to take width and height for triangle and rectangle
 */
import java.util.Scanner;

public class Base
{
public static void main(String[] args){
  int ch1=0;
  Scanner sc=new Scanner(System.in);
  do{
	  System.out.println("Enter the option:");
	  System.out.println("1. Rectangle");
	  System.out.println("2. Triangle");
	  int ch=sc.nextInt();
	  
	  switch(ch){
		  case 1:
			  System.out.println("Enter the width of Rectangle:");
			  float width=sc.nextFloat();
			  System.out.println("Enter the height of Rectangle:");
			  float height=sc.nextFloat();
			  Rectangle rec=new Rectangle();
			  rec.calculateArea(width, height);
			  break;
		  case 2:
			  System.out.println("Enter the base of Triangle:");
			  float width1=sc.nextFloat();
			  System.out.println("Enter the height of Triangle:");
			  float height1=sc.nextFloat();
			  Triangle tri=new Triangle();
			  tri.calculateArea(width1, height1);
			  break;
		  }
	  System.out.println("Do you want to continue:");
	  int no=sc.nextInt();
  }
  while(ch1==0);
 }

}