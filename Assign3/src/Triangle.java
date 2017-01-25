/*
 * Class:- to calculate the area of triangle
 */
public class Triangle extends Shape 
{
	private float area;
	//override method
	void calculateArea(float width, float height) {
		area=(float) ((0.5)*width*height);
			System.out.println("Area of Triangle is:"+area);
 }

}