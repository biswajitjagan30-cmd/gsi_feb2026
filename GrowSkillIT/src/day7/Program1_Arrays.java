package day7;

public class Program1_Arrays {

	public static void main(String[] args) {
		
		int [] age = {25,26,27,28,29};
		
		/*System.out.println(age[0]);
		System.out.println(age[1]);
		System.out.println(age[2]);
		System.out.println(age[3]);*/
		
		/*for(int i =0; i<=4; i++)
			System.out.print(age[i]+ " ");*/
		
		for(int i =0; i<=age.length-1; i++)
			System.out.print(age[i]+ " ");
		
		System.out.println();
		
		
		int height[] = new int[5];
		
		height[0] = 175;
		height[1] = 168;
		height[2] = 165;
		
		int size = 0;
		
		for(int i = 0; i<=height.length-1; i++) {
			if(height[i]!=0)
				size++;
			System.out.print(height[i]+ " ");
		}
			
		System.out.println("/nSIZE: " +size);
	}

}
