package day6;

public class Program17_polymerphism_b {
	static int globaldata = -10;
	
	static void add()
	{
		int newdata=100;
		System.out.println(10+globaldata);
	}
	static void add(int num)
	{
		System.out.println(num);
	}
	static void add(int num1 ,int num2)
	{
		System.out.println(num1+num2);
	}
	static void add(int num1, float num2)
	{
		System.out.println(num1+num2);
	}

	public static void main(String[] args) {
		
		add(globaldata);
		add();
		add(20);
		add(20,20);
		add(10,0.5F);

	}

}
