package day6;

public class Program2_Primenumber {

	public static void main(String[] args) {
		
		
		int num = 91;
		if(num ==1)
			System.out.println("Neither prime nor Composite");
		else if (num ==2)
			System.out.println("Prime");
		else if(num%2==0)
			System.out.println("Not prime");
		else
		{
			boolean flag = true;
			for(int fact=3; fact<=Math.sqrt(num); fact=fact+2)
			{
				if(num%fact==0)
				{
					flag = false;
					System.out.println("Not Prime");
					break;
				}
			}
			
			if (flag ==true)
				System.out.println("Prime");
		}
		
		
		
		

	}

}
