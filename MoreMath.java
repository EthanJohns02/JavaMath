import java.util.Scanner;
public class Main
{
	public static int twiceNum(int num)
	{
	    int numTimesTwo = num * 2;
	    return numTimesTwo;
	}
	public static int fiveNum(int num)
	{
	    int fiveNumber = num + 5;
	    return fiveNumber;
	}
	public static int numSquared(int num)
	{
	    int numSq = num * num;
	    return numSq;
	}

	
	public static void main(String[] args) 
	{
		System.out.println("Please enter two numbers");
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		
		System.out.println(twiceNum(num1));
		System.out.println(twiceNum(num2));
	    System.out.println(fiveNum(num1));
		System.out.println(fiveNum(num2));
	    System.out.println(numSquared(num1));
		System.out.println(numSquared(num2));
	    
	    
	}
    
    
}
