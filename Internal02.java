class A
 {
 	final int MAX_PI = 3.14;
 	int radius;
 }

class B extends A
 {
 	B(int radius1,int height)
 	 {
 	 	radius = radius1;
 	 	System.out.println(MAX_PI*radius*radius);
 	 }
 }