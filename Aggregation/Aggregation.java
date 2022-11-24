import java.util.Scanner;

interface Address1{
	void setValues(int temp,String temp1);
	int getPin();
	String getAddress();
}
class Address implements Address1{
	private int pin_code;
	private String name;

	public void setValues(int pin_code,String name){
		this.pin_code = pin_code;
		this.name = name;
	}
	public int getPin(){
		return this.pin_code;
	}
	String getAddress(){
		return this.name;
	}
}

class Aggregation{
	public static void main(String args[]){
		Address addr = new Address();
		addr.setValues(2222,"Suuu");
		System.out.println("Pin number is : " + addr.getPin());
		System.out.println("Pin number is : " + addr.getAddress());
	}
}