import java.util.Scanner;
class MyException extends Exception{
	public MyException(String str){
		super(str);
	}
}
class Operation{
	void addition(int a,int b) throws MyException{
		int c = a + b;
		if(c > 1000){
			throw new MyException("TooLongAddition.");
		}
		else{
			System.out.println("Addition of " + a + " and " + b + " is : " + c);
		}
	}
	void substraction(int a,int b) throws MyException{
		int c = a - b;
		if(c < 0){
			throw new MyException("NegativeAnswer.");
		}
		else{
			System.out.println("Substraction of " + a + " and " + b + " is : " + c);
		}
	}
	void multiplication(int a,int b) throws MyException{
		int c = a * b;
		if(c > 5000){
			throw new MyException("TooLongMultiplication....");
		}
		else{
			System.out.println("Multiplication of " + a + " and " + b + " is : " + c);
		}
	}
	void division(float a,float b) throws MyException
	{
		if(a == 0){
			throw new MyException("DivideByZero.");
		}
		else{
			float c = b / a;
			System.out.println("Division of " + a + " and " + b + " is : " + c);
		}
	}
	public static void main(String args[]){
		Operation op = new Operation();
		Scanner sc = new Scanner(System.in);
		int a,b,count = 0;
		float x,y;
		System.out.println("Enter the 2 values for addition, substraction and multiplication : ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Enter the 2 values for division : ");
		x = sc.nextFloat();
		y = sc.nextFloat();
		while(count < 4){
			try{
				if(count == 0){
					++count;
					op.addition(a,b);
				}
				else if(count == 1){
					++count;
					op.substraction(a,b);
				}
				else if(count == 2){
					++count;
					op.multiplication(a,b);
				}
				else if(count == 3){
					++count;
					op.division(x,y);
				}
			}
			catch(MyException e){
				System.out.println(e);
			}
		}
	}
}