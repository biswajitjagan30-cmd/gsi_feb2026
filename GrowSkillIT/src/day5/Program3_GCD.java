package day5;

public class Program3_GCD {

	public static void main(String[] args) {
		
		int num1 = 9;
		int num2 = 12;
		int gcd = 1;
		
		int small = num1;
		int big = num2;
		
		if(num2<num1)
		{
			
			small = num2;
			big = num1;
	
		}
			
		
		for (int fact =1; fact<=small; fact++)
		{
     
	if (small%fact==0 && big%fact==0)
		gcd =fact;
	
}
System.out.println(gcd);

}
}
