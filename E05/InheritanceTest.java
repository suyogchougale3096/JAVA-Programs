import java.util.*;
import java.time.LocalDate;
import java.time.Month;
class Person
 {
  String name,address;
  float height,weight;

  void setName(String name)
   {
    this.name = name;
   }
  void setAddress(String address)
   {
    this.address = address;
   }
  void setHeight(float height)
   {
    this.height = height;
   }
  void setWeight(float weight)
   {
    this.weight = weight;
   }
  String getName()
   {
    return name;
   }
  String getAddress()
   {
    return address;
   }
  float getHeight()
   {
    return height;
   }
  float getWeight()
   {
    return weight;
   }
  /*void display()
   {
    System.out.println("-------------Student details------------------");
    System.out.println("Name is : " + getName());
    System.out.println("Address is : " + getAddress());
    System.out.println("Height is : " + getHeight());
    System.out.println("Weight is : " + getWeight());
   }*/
  void calculateAge(int day,int month,int year)
   {
      LocalDate currentdate = LocalDate.now();
      //Getting the current day
      int currentDay = currentdate.getDayOfMonth();
      //Getting the current month
      Month currentMonth = currentdate.getMonth();
      //getting the current year
      int currentYear = currentdate.getYear();
      System.out.println("The age is : ");
      System.out.print(currentYear-year);
   }
 }
class Student extends Person
 {  
  int roll_no;
  int marks[] = new int[5];

  void setRollNo(int roll_no)
   {
    this.roll_no = roll_no;
   }
  void setMarks(int[] marks)
   {
    for(int i = 0; i < marks.length;i++)
     {
      this.marks[i] = marks[i];
     }
   }
  int getRollNo()
   {
    return roll_no;
   }
  int[] getMarks()
   {
    return marks;
   }
  void display()
   {
    System.out.println("-------------Student details------------------");
    System.out.println("Name is : " + getName());
    System.out.println("Address is : " + getAddress());
    System.out.println("Height is : " + getHeight());
    System.out.println("Weight is : " + getWeight());
    System.out.println("Roll No is : "+ getRollNo());
    //System.out.println("Average marks are : " + calculateAvg());
   }
  double calculateAvg()
   {
    int sum = 0;
    for(int i = 0; i < 5; i++)
     {
       sum += marks[i]; 
     }
    return sum*100/500;
   }
 }

class Employee extends Person
 {
  int empid;
  double salary;

  void setempId(int empid)
   {
    this.empid = empid;
   }
  void setSalary(double salary)
   {
    this.salary = salary;
   }
  int getempId()
   {
    return empid;
   }
  double getempSalary()
   {
    return salary;
   }

  void display()
   {
    System.out.println("Employee Details.");
    System.out.println("Name is : " + getName());
    System.out.println("Address is : " + getAddress());
    System.out.println("Height is : " + getHeight());
    System.out.println("Weight is : " + getWeight());

    System.out.println("The Id of Employee is : " + getempId());
    System.out.println("The Employee salary : " + getempSalary());
   }
 }
class InheritanceTest
 {
  public static void main(String args[])
   {
    int day,month,year;
    int marks[] = new int[5];
    String name,address,name1,address1;
    float height,weight,height1,weight1;
    int roll_no;
    Scanner sc = new Scanner(System.in);
    Student p = new Student();
    Employee e = new Employee();
    //Student
    System.out.print("\nEnter the name of student: ");
    p.name = sc.nextLine();
    System.out.print("\nEnter the address student: ");
    p.address = sc.nextLine();
    System.out.print("\nEnter the height student: ");
    p.height = sc.nextFloat();
    System.out.print("\nEnter the weight student: ");
    p.weight = sc.nextFloat();

    p.setName(p.name);
    p.setAddress(p.address);
    p.setHeight(p.height);
    p.setWeight(p.weight);

    System.out.println("\nEnter the roll number of student : ");   
    roll_no = sc.nextInt();
    System.out.println("Enter the marks for 5 subjects : ");
    for(int i = 0; i < 5; i++)
     {
      marks[i] = sc.nextInt();
     }

    p.setRollNo(p.roll_no);
    p.setMarks(p.marks);


    System.out.println(p.getRollNo());
    //marks = p.getMarks();
    p.display();
    //System.out.println("The marks that you entered.");
    System.out.println("Average of marks are : "+ p.calculateAvg());
    System.out.println("Enter the date : ");
    day = sc.nextInt();
    month = sc.nextInt();
    year = sc.nextInt();
    p.calculateAge(day,month,year);
    
    System.out.print("\nEnter the name of Employee: ");
    name1 = sc.next();
    System.out.print("\nEnter the address Employee: ");
    address1 = sc.next();
    System.out.print("\nEnter the height Employee: ");
    height1 = sc.nextFloat();
    System.out.print("\nEnter the weight Employee: ");
    weight1 = sc.nextFloat();

    e.setName(name1);
    e.setAddress(address1);
    e.setHeight(height1);
    e.setWeight(weight1);

    e.display();
   }
 }