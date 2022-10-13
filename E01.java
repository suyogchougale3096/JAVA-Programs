class E01
 {
 	public static void main(String a[])
 	 {
 	 	int day,month,year;
 	 	int k,m,c,d;
 	 	int f;
 	 	day = Integer.parseInt(a[0]);
 	 	month = Integer.parseInt(a[1]);
 	 	year = Integer.parseInt(a[2]);

 	 	System.out.println("\nYou entered date is : " +day + "-" + month + "-" + year);

 	 	if (month == 1) 
                 {
                   year--;
                 }
                if (month == 2) 
                 {
                  year--;
                 }

 	 	k = day;
 	 	m = month;
 	 	c = year / 100;
 	 	d = year % 100;
 	 	f = k + 13 * (m + 1) / 5 + d + d / 4 + c / 4 + 5 * c;

 	 	int q = f % 7;
                if(q == 0)
                {
			System.out.println("Saturday.");
                }
 	 	else if(q == 1)
 	 	{
 	 		System.out.println("Sunday.");
 	 	}
 	 	else if(q == 2)
 	 	{
			System.out.println("Monday.");

 	 	}
 	 	else if(q == 3)
 	 	{
			System.out.println("Tuesday.");
 	 		
 	 	}
 	 	else if(q == 4)
 	 	{
                        System.out.println("Wednesday");
 	 	}
 	 	else if(q == 5)
 	 	{
                        System.out.println("Thursday");
 	 	}
 	 	else if(q == 6)
 	 	{
                        System.out.println("Friday");
 	 	}
 	 }
 }