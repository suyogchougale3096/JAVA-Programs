import MyMath.Trig;
import MyMath.Arithmatic;
import MyMath.Stat;
import java.util.Scanner;
class PackDemo
 {
  public static void main(String args[])
   {
    int size,choice;
    double angle;
    float a,b;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the angle : ");
    angle = sc.nextInt();
    Trig t = new Trig();
    t.initialize(angle);
    System.out.println("The Sin value is : " + t.getSine());
    System.out.println("The Cos value is : " + t.getCos());
    System.out.println("The Tan value is : " + t.getTan());
    System.out.println("The Secant value is " + t.getSecant());
    System.out.println("The Cosecant value is " + t.getCosecant());
    System.out.println("The Cotangent value is " + t.getCotangent());
    
    Arithmatic ac = new Arithmatic();
    System.out.println("Enter the value of a : ");
    a = sc.nextFloat();
    System.out.println("Enter the value of b : ");
    b = sc.nextFloat();
    ac.initialize(a,b);
    System.out.println("Addition : " + ac.addition());
    System.out.println("Substraction : " + ac.substraction());
    System.out.println("Multiplication : " + ac.multiplication());
    System.out.println("Division : " + ac.division());

    Stat s = new Stat();
    System.out.println("Enter the size of array : ");
    size = sc.nextInt();
    s.initialize(size);
    System.out.println("Enter the elements in array : ");
    s.read();
    System.out.println("Minimum element in array is : " + s.min());
    System.out.println("Maximum element in array is : " + s.max());
    System.out.println("Numbers of element in array : " + s.count());
    System.out.println("Maximum element in array is : " + s.sum());
    System.out.println("Maximum element in array is : " + s.average());
   }
 }