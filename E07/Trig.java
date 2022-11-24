package MyMath;

public class Trig
 {
  double angle;

  public void initialize(double temp)
   {
    angle = temp;
   }
  
  public double getSine()
   {
    double temp = Math.toRadians(angle);  
    return Math.sin(temp);  
   }
  public double getCos()
   {
    double temp = Math.toRadians(angle);  
    return Math.cos(temp);  
   }
  public double getTan()
   {
    double temp = Math.toRadians(angle);  
    return Math.tan(temp);  
   }
  public double getSecant()
   {
    double temp = Math.toRadians(angle);
    return (1/Math.cos(angle));
   }
  public double getCosecant()
   {
    double temp = Math.toRadians(angle);
    return (1/Math.sin(angle));
   }
  public double getCotangent()
   {
    double temp = Math.toRadians(angle);
    return (Math.sin(temp) * Math.cos(temp));
   }
 }

