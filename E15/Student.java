import java.util.ArrayList;
import java.io.*;
class StudentInitialization{
	int roll_no;
	String name;

	StudentInitialization(){
		this.roll_no = 0;
		this.name = "";
	}
	public void setRoll(int roll_no){
		this.roll_no = roll_no;
	}
	public void setName(String name){
		this.name = name;
	}
}

class AddData{
	public ArrayList<StudentInitialization> getData(){
		int roll = 0;
		String name = "";
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Enter the roll number : ");
			roll = Integer.parseInt(b.readLine());
			System.out.println("Enter the name : ");
			name = b.readLine();
		}catch(Exception e){
			System.out.println(e);
		}

		StudentInitialization s1 = new StudentInitialization();
		s1.setRoll(roll);
		s1.setName(name);
		ArrayList<StudentInitialization> s2 = new ArrayList<StudentInitialization>();
		s2.add(s1);
		return s2;
	}
}

class Student{
	public static void main(String args[]){
		AddData a[] = new AddData[2];
		a[0] = new AddData();
		ArrayList<StudentInitialization> s1 = a[0].getData();
	}
}