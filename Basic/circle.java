import java.util.Scanner;
class Circle
{
	public static void main(String a[])
	{
	  float radius;
	  float pi=3.14f;
	  System.out.println("Enter the radius");
	  Scanner sc=new Scanner(System.in);
	  radius=sc.nextFloat();
      
      float area= pi*radius*radius;
      float diameter=2*radius;
      float circumference= 2*pi*radius;

      System.out.print("Diameter is = ");
      System.out.println(diameter);
      System.out.print("area is = ");
      System.out.println(area);
      System.out.print("Cirumference is = ");
      System.out.println(circumference);

	}
}
