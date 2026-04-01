package daily.coding.assignment;

public class Assignment_01042026_b {
	
	public static void printDiamond(int n) {
		
		for(int i =1 ; i<=n; i++) {
			
			for(int j =1 ; j<= n-i; j++) {
				
				System.out.print(" ");
			}
			for(int j =1; j<=2*i-1; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		  for(int i = n - 1; i >= 1; i--) {

	            // Spaces
	            for(int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }

	            // Stars
	            for(int j = 1; j <= 2*i - 1; j++) {
	                System.out.print("*");
	            }

	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        printDiamond(5);
	    }
	}
