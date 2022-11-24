import java.util.*;
class Square extends Thread{
	int num;
	public Square(int temp){
		num = temp;
	}
	public void run(){
		int r = num * num;
		System.out.println("Square is :" + r);
	}
}

class Cube extends Thread{
	int num;
	public Cube(int temp){
		num = temp;
	}
	public void run(){
		int r = num * num * num;
		System.out.println("Cube is :" + r);
	}
}

class RandomNo extends Thread{
	public void run(){
		Random r = new Random();
		for(int i = 0; i < 5; i++){
			int randomInt = r.nextInt(5);

			if(randomInt % 2 == 0){
				Square s = new Square(randomInt);
				s.start();
			}
			else{
				Cube c = new Cube(randomInt);
				c.start();
			}
		}
	}
}

class Thread1{
	public static void main(String args[]){
		RandomNo r1 = new RandomNo();
		r1.start();
	}
}