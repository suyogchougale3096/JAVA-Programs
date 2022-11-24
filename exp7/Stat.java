package MyMath;
import java.util.*;
public class Stat
{
	private int min,max,sum,avg;
	int arr[]=new int[5];
	Scanner sc=new Scanner(System.in);
	public Stat()
	{
		
		
		System.out.println("enter 5 elements:-");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	public void calMin()
	{
		
		min=arr[0];
		for(int i=0;i<5;i++)
		{
			if(arr[i]<min)
			{min=arr[i];}
		}
	}
	public void calMax()
	{
		
		max=arr[0];
		for(int i=0;i<5;i++)
		{
			if(arr[i]>max)
			{max=arr[i];}
		}
	}
	public void calSum()
	{
		
		
		for(int i=0;i<5;i++)
		{
			sum+=arr[i];
		}
	}
	public void calAvg()
	{
		
		
		avg=sum/5;
	}
	public int getMin()
	{return min;}
	public int getMax()
	{return max;}	
	public int getSum()
	{return sum;}
	public int getAvg()
	{return avg;}
}