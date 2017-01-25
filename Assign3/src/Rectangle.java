/*
 * Class:- to calculate the area of rectangle
 */
public class Rectangle extends Shape {
 private float area;

 //@Override method
 void calculateArea(float width, float height) {
	 			area=width*height;
	 			System.out.println("Area of rectangle is:"+area);
 }
 
}