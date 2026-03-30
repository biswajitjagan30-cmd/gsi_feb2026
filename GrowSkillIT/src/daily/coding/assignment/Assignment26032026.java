package daily.coding.assignment;

import java.util.Scanner;

public class Assignment26032026 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        // Logic to calculate sum of cubes of digits
        while (num > 0) {
            int digit = num % 10;          // get last digit
            sum = sum + (digit * digit * digit); // cube and add
            num = num / 10;                // remove last digit
        }

        // Check Armstrong condition
        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is NOT an Armstrong number");
        }

        sc.close();
		
		
		

	}

}
