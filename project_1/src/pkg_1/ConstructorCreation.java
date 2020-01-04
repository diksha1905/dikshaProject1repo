package pkg_1;

public class ConstructorCreation 
{

	public ConstructorCreation() 
	{
		this(20,30,40);
		System.out.println("Its a default constructor.");	
	}	
	
	public ConstructorCreation(int a) 
	{
		this();
		System.out.println("Its a one parametrized constructor.");	
	}	
	
	public ConstructorCreation(int a, int b) 
	{
		this(10,20,30,40);
		System.out.println("Its a two parametrized constructor.");	
	}	
	
	public ConstructorCreation(int a, int b, int c) 
	{
		System.out.println("Its a three parametrized constructor.");	
	}	
	
	public ConstructorCreation(int a, int b, int c, int d) 
	{
		this(7);
		System.out.println("Its a four parametrized constructor.");	
	}	
	
	public static void main(String[] args) 
	{
		ConstructorCreation obj1 = new ConstructorCreation(90,89);
	}	
}
