

	 public class Rectangle extends Shape
	 {

		  private final double width, length;

		   public Rectangle() 
		   {

		     this(1,1);

		   }

		   public Rectangle(double width, double length)
		   {

		     this.width = width;

		     this.length = length;

		    }

		 

		  public double area()
		  {

		  double area;
		  area=width*length;
		      System.out.println("The area of rectangle is "+area);
		        return area; 
		   }

	 }


