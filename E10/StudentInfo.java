import java.io.*;
import java.util.*;
class StudentInfo{
	int roll_no,age;
	String class1,city,phone,name;
	float weight,height;

	StudentInfo(int roll_no,int age,String class1,String city,String phone,float weight,float height,String name){
		this.roll_no = roll_no;
		this.age = age;
		this.class1 = class1;
		this.city = city;
		this.phone = phone;
		this.weight = weight;
		this.height = height;
		this.name = name;
	}

	int getRoll(){
		return roll_no;
	}
	int getAge(){
		return age;
	}
	String getClass(){
		return class1;
	}
	String getCity(){
		return city;
	}
	String getPhone(){
		return phone;
	}
	float getWeight(){
		return weight;
	}
	float getHeight(){
		return height;
	}
	String getName(){
		return name;
	}



	public static void main(String args[])throws IOException{
		//DataInputStream b = new DataInputStream(System.in);
		int roll_no,age;
		String class1,city,phone,name;
		float weight,height;
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		int choice = 0;
		System.out.println("Menu..");
		System.out.println("1.Enter the student data :");
		System.out.println("2.Display the student data : ");
		System.out.print("\nEnter the choice : ");
		choice = Integer.parseInt(b.readLine());

		switch(choice){
		case 1:
			System.out.println("Enter the roll number : ");
			roll_no = Integer.parseInt(b.readLine());
			System.out.println("Enter the Name : ");
			name = b.readLine();
			System.out.println("Enter the age : ");
			age = Integer.parseInt(b.readLine());
			System.out.println("Enter the height : ");
			height = Float.parseFloat(b.readLine());
			System.out.println("Enter the weight : ");
			weight = Float.parseFloat(b.readLine());
			System.out.println("Enter the class : ");
			class1 = b.readLine();
			System.out.println("Enter the city : ");
			city = b.readLine();
			System.out.println("Enter the phone : ");
			phone = b.readLine();

			StudentInfo s = new StudentInfo(roll_no,age,class1,city,phone,name,weight,height,name);
			break;
		case 2:
			break;
		default:
			System.out.println("Select proper option!");
		}
	}
}