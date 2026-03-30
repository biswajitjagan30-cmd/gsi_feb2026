package daily.coding.assignment;

import java.util.Scanner;

public class Assignment27032026 {

	public static void main(String[] args) {
		

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        // Check for numbers less than 2
        if (num < 2) {
            isPrime = false;
        } else {
            // Check divisibility from 2 to num/2
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Output result
        if (isPrime) {
            System.out.println(num + " is a Prime number");
        } else {
            System.out.println(num + " is NOT a Prime number");
        }

        sc.close();
	

	}

}
