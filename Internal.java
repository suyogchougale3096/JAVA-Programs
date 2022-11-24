import java.util.Scanner;
class Studentinfo
 {
  private String studentID;
  private String studentName;

  void set_ID(String temp1)
   {
    studentID = temp1;
   }
 
  void set_values(String name)
   {
    
    studentName = name;
   }
  String getID()
   {
    return studentID;
   }
  String getName()
   {
    return studentName;
   }
 }

class StudentMarks extends Studentinfo
 {
  private int marks1,marks2,marks3;
  
  void set_marks(int m1,int m2,int m3)
   {
    marks1 = m1;
    marks2 = m2;
    marks3 = m3;
   }
  int getMarks1()
   {
    return marks1;
   }
  int getMarks2()
   {
    return marks2;
   }
  int getMarks3()
   {
    return marks3;
   }
 }

class StudentResult extends StudentMarks 
 {
  private int totalMarks = 0;
  
  int calculatetotalMarks()
   {
    return totalMarks = getMarks1() + getMarks2() + getMarks3();
   }
  void display()
   {
    System.out.println("****************************** Information *********************************");
    System.out.println("Student ID : " + getID());
    System.out.println("Student Name : " + getName());
    System.out.println("Marks -->");
    System.out.println("Marks for 1 st subject : " + getMarks1());
    System.out.println("Marks for 2 nd subject : " + getMarks2());
    System.out.println("Marks for 3 rd subject : " + getMarks3());
    System.out.println("Total Marks obtained : " + calculatetotalMarks());
   }
 }

class Internal
 {
  public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);
    String id,name,temp = "299";
    int m1,m2,m3,i1 = 0,count = 0;
    StudentResult s[] = new StudentResult[5];

    
    for(int i = 0; i < 5; i++)
     {
      s[i] = new StudentResult(); 
      count = Integer.parseInt(temp);
      ++count;
      temp = Integer.toString(count);
      s[i].set_ID(temp);
      System.out.println("For student ID : " + s[i].getID());
      // id = sc.next();
      System.out.println("Enter the student name : ");
      name = sc.next();
      System.out.println("Enter the marks for 3 subjects : ");
      m1 = sc.nextInt();
      m2 = sc.nextInt();
      m3 = sc.nextInt();
      s[i].set_values(name);
      s[i].set_marks(m1,m2,m3);
     }
    for(int i = 0; i < 5; i++)
     {
      s[i].display();
     }
    int max = s[0].calculatetotalMarks();
    for(int i = 1; i < 5; i++)
     {
      if(s[i].calculatetotalMarks() > max)
       {
        i1 = i;
       }
     }

    System.out.println("****************************** Information *********************************");
    System.out.println("Topper of the class : ");
    System.out.println("Student Id : " + s[i1].getID());
    System.out.println("Student Name : " + s[i1].getName());
    System.out.println("Marks -->");
    System.out.println("Marks for 1 st subject : " + s[i1].getMarks1());
    System.out.println("Marks for 2 nd subject : " + s[i1].getMarks2());
    System.out.println("Marks for 3 rd subject : " + s[i1].getMarks3());
    System.out.println("Total Marks obtained : " + s[i1].calculatetotalMarks());
   }
 }