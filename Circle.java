import java.util.*;
class Circle 
{
	static double pi = 3.142;
	int radius;

	public Circle(int r)
	{
		radius = r;

	}

	public void area()
	{
		double areas;
		areas = pi * radius *radius;

		System.out.println("Area of circle is   " +areas);
	}

	public void circum()
	{
		double circumf;
		circumf = 2 *pi *radius;
		System.out.println(" Circumference of circle is    " +circumf);
	}

	public static void main(String[] args) 
	{
		System.out.println ( "Please enter the radius of first circle " );
		Scanner s1 = new Scanner(System.in);
		 int r1 = s1.nextInt();

		 System.out.println ( "Please enter the radius of second circle " );
		Scanner s2 = new Scanner(System.in);
		 int r2 = s2.nextInt();
		
		Circle c1 = new Circle(r1);
		Circle c2 = new Circle(r2);

		c1.area();
		c1. circum();
		c2.area();
		c2.circum();

		System.out.println("Circle program got executed successfully");
	}
}
