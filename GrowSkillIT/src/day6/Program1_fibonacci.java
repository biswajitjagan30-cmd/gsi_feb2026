package day6;

public class Program1_fibonacci {

	public static void main(String[] args) {
		
		
		int count =10;
		int num1 =0;
		int num2 = 1;
		System.out.println(num1+  " "+num2+ " ");
		int i =1;
		count = count-2;
		while(i<=count)
		
		{
			
		// num3 = 3
			
			int num3 = num1+num2;
			System.out.println(num3+" ");
			num1=num2;
			num2=num3;
			i++;
			
		}
		
		

	}

}
