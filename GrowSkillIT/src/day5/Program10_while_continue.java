package day5;

public class Program10_while_continue {

	public static void main(String[] args) {
		
	      System.out.println("Hello");

	        int i = 1;

	        while (i <= 10) {
	            if (i == 5) {
	                i++;          // important: increment before continue
	                continue;     // skip 5
	            }

	            System.out.print(i + " ,");
	            i++;              // increment
	        }

	        System.out.println("\nBye");
	    }

	}


