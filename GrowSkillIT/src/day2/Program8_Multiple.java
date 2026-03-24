package day2;

public class Program8_Multiple {

	public static void main(String[] args) {
		int num = 5;
		
		if (num%2 == 0 && num%10 !=0)
			System.out.println("multiple of 2");
		
		else if(num%10 == 0)
			System.out.println("multiple of 10");
		else
			System.out.println("not a multiple of 2");

	}

}
