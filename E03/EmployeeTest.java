import java.io.*;
import java.util.*;
class Employee
{
		Scanner sc=new Scanner(System.in);
		String first_name,last_name;
		float salary,year_salary;
		Employee()
		{
			this.first_name="";
			this.last_name="";
			this.salary=0;
		}
		void set()
		{
		System.out.println("enter first name:-");
		this.first_name=sc.next();
		System.out.println("enter last name:-");
		this.last_name=sc.next();
		System.out.println("enter salary:-");
		this.salary=sc.nextInt();
		if(salary<0) this.salary=0;
		
		
		}
		String get_first_name()
		{
			return this.first_name;
		}
		String get_last_name()
		{
			return this.last_name;
		}
		float get_salary()
		{
			return this.salary;
		}
		float get_yearly_salary()
		{this.year_salary=this.salary*12;
			return this.year_salary;
		}
		void salary_increment()
		{
			this.salary=this.salary+(this.salary/10);		
			
		}
		

}
class EmployeeTest
{
	public static void main(String[] args)
	{
		Employee e1=new Employee();	
		Employee e2=new Employee();
		e1.set();
		e2.set();	
		System.out.println("\tdata before increment:-");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("First name \t last name \t salary \t yearly salary");
		System.out.println(e1.get_first_name()+" \t "+e1.get_last_name()+" \t "+e1.get_salary()+" \t "+e1.get_yearly_salary());
		System.out.println(e2.get_first_name()+" \t "+e2.get_last_name()+" \t "+e2.get_salary()+" \t "+e2.get_yearly_salary());
		e1.salary_increment();
		e2.salary_increment();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("\tdata after increment:-");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("First name \t last name \t salary \t yearly salary");
		System.out.println(e1.get_first_name()+" \t "+e1.get_last_name()+" \t "+e1.get_salary()+" \t "+e1.get_yearly_salary());
		System.out.println(e2.get_first_name()+" \t "+e2.get_last_name()+" \t "+e2.get_salary()+" \t "+e2.get_yearly_salary());
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	}
}