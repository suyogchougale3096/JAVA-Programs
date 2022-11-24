import java.util.*;

class SimpleArrayList{
	public static void main(String args[]){
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		System.out.println(al.get(0));
		System.out.println(al);
		al.add(1,3);
		System.out.println(al);
		al.set(1,10);
		System.out.println(al);

		Iterator<Integer> i1 = al.iterator();
		while(i1.hasNext()){
			System.out.println(i1.next());
		}
	}
}