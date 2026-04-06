package day6;

public class Program19_Polymerphism_d {
	
	
	static void incByFive(int num)
	{
		
		num = num+5;
		System.out.println("inside the method: "+ num);
	}
	static void incByTwo(int[] num2)
	{
		num2[0] = num2[0]+2;
		System.out.println("onside the method: "+ num2[0]);
	}

	public static void main(String[] args) {
		
		
		int num = 10;
		int[]data = {10,20};
		incByFive(num);
		System.out.println("new value of num: "+ num);
		incByTwo(data);
		System.out.println("new value of array: "+ data[0]);
		
		
		

	}

}
