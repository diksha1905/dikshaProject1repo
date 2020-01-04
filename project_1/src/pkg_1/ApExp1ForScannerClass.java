package pkg_1;

import java.util.Scanner;

public class ApExp1ForScannerClass 
{
	int x, y, z, m;
	public int add(int a, int b)
	{
	x = a+b;
	System.out.println("sum is :" + x);
	return x;
	} 
	
	public int sub(int a, int b)
	{
	y = a-b;
	System.out.println("sub result is :" + y);
	return y;
	}
	
	public int mul(int a, int b)
	{
    int z= a*b;
    System.out.println("mul result is :" + z);
	return z;
	}
	
	public void div(int a, int b)
	{
    int m= a/b;
    System.out.println("Expression (((((*1+ *2)-*3)+ *4) *5/*6) result is : " + m);
	}
	
	public static void main(String[] args) 
	{
		Scanner num = new Scanner(System.in);
		
		System.out.println("Enter value for X1:" );
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
		
		ApExp1ForScannerClass exp = new ApExp1ForScannerClass();
		int sum1 = exp.add(x1,x2);
		int sub = exp.sub(sum1,x3);
		int sum2 = exp.add(sub,x4);
		int mul = exp.mul(sum2,x5);
		exp.div(mul,x6);
		num.close();
	}
}

