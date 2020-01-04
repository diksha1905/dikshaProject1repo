package pkg_1;

public class ThisKeywordImplementionInMethod 
{
	public void methodDefault()
	{
		System.out.println("Default method");
	}
	
	public void methodOne()
	{
		System.out.println("First method");
	}
	
	public void methodTwo()
	{
		System.out.println("Second method");
	}
	
	public void methodThree()
	{
		System.out.println("Third method");
		this.methodDefault();
		this.methodOne();
		this.methodFour();
		this.methodTwo();
	}
	
	public void methodFour()
	{
		System.out.println("Fourth method");
	}
	
	public static void main(String[] args) 
	{
		ThisKeywordImplementionInMethod a= new ThisKeywordImplementionInMethod();
		a.methodThree();
	}
	
}
