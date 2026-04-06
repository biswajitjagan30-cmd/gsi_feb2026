package day6;

public class Program18_Polymerphism_c {
	
	static void incByFive(int num)
	{
		num = num+5;
		System.out.println("inside the method: "+ num);
	}

	public static void main(String[] args) {
		
		int num =10;
		incByFive(num);
		System.out.println("new value of num: "+ num);

	}

}
