package daily.coding.assignment;
import java.util.Scanner;

public class Assignment24032026 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;
        boolean isFail = false;

        // Input marks
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();

            // Check fail condition
            if (marks[i] < 33) {
                isFail = true;
            }

            total += marks[i];
        }

        // If fail
        if (isFail) {
            System.out.println("Result: Fail");
            System.out.println("Grade: F");
        } else {
            // Calculate percentage
            double percentage = total / 5.0;

            System.out.println("Result: Pass");
            System.out.println("Percentage: " + percentage + "%");

            // Grade calculation
            if (percentage >= 90) {
                System.out.println("Grade: A+");
            } else if (percentage >= 75) {
                System.out.println("Grade: A");
            } else if (percentage >= 60) {
                System.out.println("Grade: B");
            } else if (percentage >= 50) {
                System.out.println("Grade: C");
            } else {
                System.out.println("Grade: D");
            }
        }

        sc.close();
		
	}

}
