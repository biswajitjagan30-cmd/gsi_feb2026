package day2;

public class Program6_nestedIfelse {

	public static void main(String[] args) {
		int age = 19; char gender = 'F';
		if (age == 18)
		{
			System.out.println("congrats on your first vote");
			if (gender == 'F')
			{
				System.out.println("please vote girl");
			}
			else
			{
				System.out.println("please vote boy");
			}
		}

		if (age >= 18)
		{
			System.out.println("you can vote");
		}
		else
		{
			System.out.println("you can not vote");
		}
	}

}
