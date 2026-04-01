package day6;

public class Program13_Method {
	
	static boolean checkEven(int num)
	{
		if(num%2 ==0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		boolean result1=checkEven(13);
		boolean result2=checkEven(12);
		System.out.println(result1);
		System.out.println(result2);

	}

}
