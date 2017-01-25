

	 public class Triangle extends Shape
	 {

		  private final double x, y, z;

		 

		  public Triangle(double x, double y, double z)
		  {

		   this.x = x;

		   this.y = y;

		   this.z = z;

		  }

		 

		  public double area()
		  {

		  
		    double s = (x*y*z) ;
		  
		  System.out.println("The area of rectangle is "+s);
		        
		     return s;
		  

		  }

 }


