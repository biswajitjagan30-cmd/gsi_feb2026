package day5;

public class Program1_factors {

	public static void main(String[] args) {
		
		int num = 20;
		System.out.println("Factors of " + num + " are");
		for (int i = 1; i <= num; i++)
		{if (num%i ==0) {
			
			System.out.print(i + ", ");
			}
		}
			
		

	}

}
