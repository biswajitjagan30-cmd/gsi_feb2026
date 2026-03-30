package weeklyassignments;

import java.util.Scanner;

public class Datatype_assignment2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Step 1: Take character input
        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);
        
        // Step 2: Char → Int (ASCII value)
        int asciiValue = ch;
        System.out.println("ASCII value: " + asciiValue);
        
        // Step 3: Add 5 to ASCII value
        int newAscii = asciiValue + 5;
        System.out.println("New ASCII value: " + newAscii);
        
        // Step 4: Int → Char conversion
        char newChar = (char) newAscii;
        System.out.println("New character: " + newChar);
        
        sc.close();

	}

}
