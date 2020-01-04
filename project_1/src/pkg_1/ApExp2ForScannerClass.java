package pkg_1;

import java.util.Scanner;

public class ApExp2ForScannerClass {
	
	//Expression (((((x1-x2)*x3)-x4)+x5/x6)
	
	public int add(int a, int b) 
	{
		int c = a + b;
		System.out.println("sum is :" + c);
		return c;
	}
	
	public int sub(int a, int b) 
	{
		int c = a - b;
		System.out.println("sub result is :" + c);
		return c;
	}
	
	public int mul(int a, int b) 
	{
		int c = a*b;
		System.out.println("mul result is :" + c);
		return c;
	}
	
	public int div(int a, int b) 
	{
		int c = a/b;
		System.out.println("Final result is :" + c);
		return c;
	}
		
	public static void main(String[] args)
	{
		Scanner num = new Scanner(System.in);
		System.out.println("Enter value of x1:" );
		int x1 = num.nextInt();
		System.out.println("Enter value for X2:" );
		int x2 = num.nextInt();
		System.out.println("Enter value for X3:" );
		int x3 = num.nextInt();
		System.out.println("Enter value for X4:" );
		int x4 = num.nextInt();
		System.out.println("Enter value for X5:" );
		int x5 = num.nextInt();
		System.out.println("Enter value for X6:" );
		int x6 = num.nextInt();
		
		ApExp2ForScannerClass obj = new ApExp2ForScannerClass();
		int sub = obj.sub(x1, x2);
		int mul = obj.mul(sub, x3);
		int sub2 = obj.sub(mul, x4);
		int add = obj.add(sub2,x5);
		obj.div(add, x6);
				
		
	}

}
