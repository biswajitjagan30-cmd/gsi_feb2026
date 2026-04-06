package daily.coding.assignment;
import java.util.Scanner;

public class Assignment_03042026 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [][] A = new int[3][4];
		int [][] B = new int[3][4];
		int [][] C = new int[3][4];
		
		// 1 input Matrix A
		
		System.out.println("Enter Matrix A:");
		for( int i =0; i<3; i++) {
			
			for (int j = 0; j<4; j++) {
				
				A[i][j] = sc.nextInt();
			}
		}
		// 2 input of Matrix B
		System.out.println("Enter Matrix B:");
		for( int i =0; i<3; i++) {
			
			for (int j =0; j<4; j++) {
				
				B[i][j] = sc.nextInt();
			}
		}
		//Step 3 & 4: Addition + Find Max
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 4; j++) {
				//Add
				C[i][j] = A[i][j] + B[i][j];
				
				// find Max
				
				if(C[i][j] > max) {
					
					max = C[i][j];
				}
				
			}
		}
		 // Print Result
		   System.out.println("Result Matrix:");
	        for(int i = 0; i < 3; i++) {
	            for(int j = 0; j < 4; j++) {
	                System.out.print(C[i][j] + " ");
	            }
	            System.out.println();
	        }
	        
	     // Print Max
	        System.out.println("Maximum Element: " + max);

	        sc.close();

	}

}
