import java.util.*;
class Experiment14 extends Thread{
	public static void main(String args[]){
		Random r = new Random();
		int x;
		for(int i = 0; i < 5; i++)
		{
			x = r.nextInt(10);
			try
			{
				sleep(1000);
				System.out.println(x);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}