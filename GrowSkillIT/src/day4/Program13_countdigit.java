package day4;

public class Program13_countdigit {

	public static void main(String[] args) {
	
		int count = 0;
		
		int num = 123456;
		
		while (num > 0)
		{
			
			num = num/10;
			count++;
		}
		
		System.out.println(count);

	}

}
