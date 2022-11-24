package MyMath;
import java.util.*;
public class Trig
{
	 private double angle,v,sin,cos,tan,sec,cosec,cot;

	Scanner sc=new Scanner(System.in);
	public Trig()
	{
		System.out.print("enter angle value:-");
		angle=sc.nextDouble();
		
		v=Math.toRadians(angle);
	}
	public void setSineValue()
	{
		sin=Math.sin(v);
		
	}
	public void setCosineValue()
	{
		cos=Math.cos(v);
	
	}
	public void setTangentValue()
	{
		tan=Math.tan(v);
	
	}
	public void setSecantValue()
	{
		sec=1/cos;
	
	}
	public void setCosecantValue()
	{
		cosec=1/sin;
	
	}
	public void setCotValue()
	{
		cot=1/tan;
	
	}
	public double getSin()
	{
		return sin;
	}
	public double getCos()
	{
		return cos;
	}
	public double getTan()
	{
		return tan;
	}
	public double getSec()
	{
		return sec;
	}
	public double getCosec()
	{
		return cosec;
	}
	public double getCot()
	{
		return cot;
	}
}