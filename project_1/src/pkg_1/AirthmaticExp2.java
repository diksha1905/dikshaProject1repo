package pkg_1;

public class AirthmaticExp2 
{
	//Assignment2 day2 ((((10-2)+2)*2)-2)/2) 
	int a,b,c,d,e,f;
	
	public int add(int a, int b)
	{
	c = a+b;
	return c;
	} 
	
	public int sub(int c , int b)
	{
	d = c-b;
	return d;
	}
	
	public int mul(int g, int b)
	{
    e = g*b;
	return e;
	}
	
	public void div(int e, int b)
	{
    f = e/b;
    System.out.println("Expression ((((10-2)+2)*2)-2)/2) result is : " + f);
	 // return f; {mistake: no need of this statement 
    // in last method as here we
    // are calling this method directly in main method
    // hence result is not required through return statement.
	}
    public static void main(String[] args) 
	{
	AirthmaticExp2 obj = new AirthmaticExp2();
	int sub_result = obj.sub(10,2);
	int sum_result = obj.add(sub_result,2);
	int mul_result = obj.mul(sum_result, 2);
	sub_result = obj.sub(mul_result, 2);
	obj.div(sub_result, 2);
	}
}	


