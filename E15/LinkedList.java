import java.util.*;

class LinkedList{
	public static void main(String args[]){
		Stack<Integer> s1 = new Stack<Integer>();
		s1.push(1);
		s1.push(3);
		s1.pop();
		System.out.println(s1);
		System.out.println(s1.isFull());
	}
}