package day6;

public class Program12_patternpractice3 {

	public static void main(String[] args) {
		int num = 1;
		for(int r=1; r<=5; r++)
		{
			
			for(int col=1; col<=r; col++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}

	}

}
