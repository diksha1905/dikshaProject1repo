package pkg_1;

public class AirthmaticProblem1 
{
	//Assignment1 ((((10+2)-2)+2)*2)/2)
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
    System.out.println("Expression ((((10+2)-2)+2)*2)/2) result is : " + f);
	}
	
	public static void main(String[] args) 
	{
	AirthmaticProblem1	obj = new AirthmaticProblem1();
	int sum_result = obj.add(10,2);
	int sub_result = obj.sub(sum_result, 2);
	sum_result = obj.add(sub_result, 2);
	int mul_result = obj.mul(sum_result, 2);
	obj.div(mul_result, 2);
	}
}	
