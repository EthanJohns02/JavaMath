import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World");
		int x, y, z, a, b, c;
		System.out.println("Please enter 3 numbers");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		a = x+y+z;
		b = a/3;
		c = x*y*z;
		
		System.out.println("The sum equals "+a);
		System.out.println("The average equals "+b);
		System.out.println("The product equals "+c);

        if (x > y && x > z)
            System.out.println(x+" is the largest number.");
        else if (y > x && y > z)
            System.out.println(y+" is the largest number.");
        else if (z > x && z > y)
            System.out.println(z+" is the largest number.");
        else
            System.out.println("The numbers are all largest.");
            
        if (x < y && x < z)
            System.out.println(x+" is the smallest number.");
        else if (y < x && y < z)
            System.out.println(y+" is the smallest number.");
        else if (z < x && z < y)
            System.out.println(z+" is the smallest number.");
        else
            System.out.println("The numbers are all smallest.");    
	}
}
