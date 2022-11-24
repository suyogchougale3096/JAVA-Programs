import java.util.Scanner;
class Employee
 {
  static String fname,lname;
  static double monthly_salary;
  
  //Constructor
  public Employee()
   {
    fname = "";
    lname = "";
    monthly_salary = 0;
   } 

  //Getting Input From user
  //For Name
  public static String Input()
   {
    String name;
    Scanner sc = new Scanner(System.in);
    name = sc.nextLine();
    return name;
   }
  //For Salary.
  public static double inputSalary()
   {
    double salary;
    Scanner sc = new Scanner(System.in);
    salary = sc.nextDouble();
    if(salary <= 0)
     {
      salary = 0;
     }
    return salary;
   }
  //Yearly Salary
  public static void yearlySalary(double s)
   {
    double yearly_salary;
    System.out.println("Before raising salary yearly pakage is about " + monthly_salary * 12 + "LPA");
   }
  //Raise Salary
  public static void RaiseSalry(double Salary)
   {
    double raiseSalary = Salary / 100;
    Salary += raiseSalary;
    System.out.println("After raising salary yearly package is about : " +Salary * 12 + "LPA");
   }
  //Getter setter 
  //First Name
  public static void setfname(String name)
  {
   fname = name;
  }
  public static String getfname()
  {
   return fname;
  }

 //Last Name
  public static void setlname(String name)
  {
   lname = name;
  }
  public static String getlname()
  {
   return lname;
  }

  //Salary
  public static void setSalary(double salary)
   {
    monthly_salary = salary;
   } 
  public static double getSalary()
   {
    return monthly_salary;
   }
  public static void display()
   {
    System.out.println("-------------------Details of Employee------------------");
    System.out.println("First name is : "+fname);
    System.out.println("Last name is : "+lname);
    System.out.println("Monthly Salary is : "+monthly_salary);
   }
 }

class EmployeeTest
 {
  public static void main(String args[])
   {
    //Variable.
    Scanner sc = new Scanner(System.in);
    String fname,lname;
    double monthly_salary;

    //Emp1 and emp2
    Employee emp1 = new Employee();
    System.out.print("\nEnter the first name : ");
    fname = emp1.Input();
    System.out.print("\nEnter the last name : ");
    lname = emp1.Input();
    System.out.print("\nEnter the salary : ");
    monthly_salary = emp1.inputSalary();
    
    
    //Emp1 Setter Getter.
    emp1.setfname(fname);
    fname = emp1.getfname();
    emp1.setlname(lname);
    lname = emp1.getlname();
    emp1.setSalary(monthly_salary);
    monthly_salary = emp1.getSalary();

    emp1.display();
    emp1.yearlySalary(monthly_salary);
    emp1.RaiseSalry(monthly_salary);
    System.out.println();
    
    Employee emp2 = new Employee();
    System.out.print("\nEnter the first name : ");
    fname = emp2.Input();
    System.out.print("\nEnter the last name : ");
    lname = emp2.Input();
    System.out.print("\nEnter the salary : ");
    monthly_salary = emp2.inputSalary();

    //Emp2 Setter Getter.
    emp2.setfname(fname);
    fname = emp2.getfname();
    emp2.setlname(lname);
    lname = emp2.getlname();
    emp2.setSalary(monthly_salary);
    monthly_salary = emp2.getSalary();

    emp2.display();
    emp2.yearlySalary(monthly_salary);
    emp2.RaiseSalry(monthly_salary);
    System.out.println();

    
   }
 }