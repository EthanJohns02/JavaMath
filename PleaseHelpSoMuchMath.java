import java.util.Scanner;
public class Main
{
	public static double percentNum(double num1, double num2)
	{
	    double percentageNum = (num1 / num2)*100;
	    return percentageNum;
	}

	
	public static void main(String[] args) 
	{
		System.out.println("Please enter two numbers");
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		
		System.out.println(num1 + " is " + percentNum(num1,num2)+"% of "+num2);
	    
	    
	}
    
    
}
