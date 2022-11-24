package MyMath;
import java.util.Scanner;
public class Stat
 {
  int size;
  int[] arr;
  public void initialize(int s)
   {
    size = s;
    arr = new int[size];
   }
  public void read()
   {
    Scanner sc = new Scanner(System.in);
    for(int i = 0; i < size; i++)
     {
      arr[i] = sc.nextInt();
     }
   }
  public int min()
   {
    int temp = arr[0];
    for(int i = 1; i < size; i++)
    {
        if(arr[i] < temp)
        {
            temp = arr[i];
        }
    }
    return temp;
   }

  public int max()
   {
    int temp = arr[0];
    for(int i = 1; i < size; i++)
    {
        if(arr[i] > temp)
        {
            temp = arr[i];
        }
    }
    return temp;
   }

  public int count()
   {
    int count = 0;
    for(int i = 0; i < size; i++)
    {
        count++;
    }
    return count;
   }

  public float sum()
   {
    float sum = 0;
    for(int i = 0; i < size; i++)
    {
        sum = sum + arr[i];
    }
    return sum;
   }

  public float average()
   {
    float temp = sum()/size;
    return temp;
   }
 }