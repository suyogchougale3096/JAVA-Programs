import MyMath.Trig;
import MyMath.Arithmetic;
import MyMath.Stat;
class PackDemo
{
	public static void main(String[] args)
	{
		Trig t1=new Trig();
		t1.setSineValue();
		t1.setCosineValue();
		t1.setTangentValue();
		t1.setSecantValue();
		t1.setCosecantValue();
		t1.setCotValue();
		System.out.println("all trignometric operation result:-");
		System.out.println("********************************************");				System.out.println("\tsine value:-"+t1.getSin());
		
		System.out.println("\tcosine value:-"+t1.getCos());
		
		System.out.println("\ttangent value:-"+t1.getTan());
		
		System.out.println("\tsec value:-"+t1.getSec());
		
		System.out.println("\tcosec value:-"+t1.getCosec());
		
		System.out.println("\tcot value:-"+t1.getCot());
		
		System.out.println("********************************************");	
		Arithmetic a1=new Arithmetic();
		System.out.println("all arithmetic operation result:-");
		System.out.println("********************************************");
		System.out.println("\taddtion:-"+a1.getAddtion());	
		System.out.println("\tsubtraction:-"+a1.getSubtraction());	
		System.out.println("\tmultiplication:-"+a1.getMultiplication());	
		System.out.println("\tdivision:-"+a1.getDivision());	
		System.out.println("********************************************");
		Stat s1=new Stat();
		s1.calMin();
		s1.calMax();
		s1.calSum();
		s1.calAvg();
		System.out.println("all statistical operation result:-");
		System.out.println("********************************************");
		System.out.println("\tminimum element in array:-"+s1.getMin());	
		System.out.println("\tmaximum element in array:-"+s1.getMax());	
		System.out.println("\tsum of array elements:-"+s1.getSum());	
		System.out.println("\taverage of array elements:-"+s1.getAvg());
		System.out.println("********************************************");
		
	}
}