package day6;

public class Program11_starpatternpractice {

	public static void main(String[] args) {
		
		
		for(int row=1; row<=5; row++)
		{
			
			for (int sp=1; sp<row; sp++)
				System.out.print(" ");
			for (int col =1;col<=6-row;col++ )
				System.out.print(col);
			System.out.println();
		}
		
		
		
		

	}

}
