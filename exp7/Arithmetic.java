package MyMath;
import java.util.*;
public class Arithmetic
{
	private float a,b;
	Scanner sc=new Scanner(System.in);
	public Arithmetic()
	{
		System.out.println("enter first float number:-");
		a=sc.nextFloat();
		System.out.println("enter second float number:-");
		b=sc.nextFloat();
	}
	public float getAddtion()
	{
		return a+b;
	}
	public float getSubtraction()
	{
		return a-b;
	}
	public float getMultiplication()
	{
		return a*b;
	}
	public float getDivision()
	{
		return a/b;
	}
}