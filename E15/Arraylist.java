import java.util.ArrayList;
import java.io.*;
import java.util.Iterator;
class Person{
	int pid;
	String pname;

	Person(int pid,String pname){
		this.pid = pid;
		this.pname = pname;
	}
	public int getId(){
		return this.pid;
	}
	public String getName(){
		return this.pname;
	}
}
class Arraylist{
	public static void main(String args[]){
		int id = 0;
		String name = "";
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Person> person = new ArrayList<Person>();
		
		try{
			System.out.println("Enter the Person ID : ");
			id = Integer.parseInt(b.readLine());
			System.out.println("Enter the person name : ");
			name = b.readLine();
		}
		catch(Exception e){
			System.out.println(e);
		}
		Person p1 = new Person(id,name);

		try{
			System.out.println("Enter the Person ID : ");
			id = Integer.parseInt(b.readLine());
			System.out.println("Enter the person name : ");
			name = b.readLine();
		}
		catch(Exception e){
			System.out.println(e);
		}
		Person p2 = new Person(id,name);

		System.out.println("Employee id is : " + p1.getId() + "\nEmployee name is : " + p1.getName());
		System.out.println("Employee id is : " + p2.getId() + "\nEmployee name is : " + p2.getName());
		person.add(p1);
		person.add(p2);
		
		Iterator<Person> i1 = person.iterator();
		while(i1.hasNext()){
			Object values = i1.next();
			System.out.println(values);
		}
	}
}