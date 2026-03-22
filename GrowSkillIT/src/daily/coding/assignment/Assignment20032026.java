package daily.coding.assignment;

public class Assignment20032026 {

	public static void main(String[] args) {
		 // Step 1: Float value
        float marks = 97.8f;
        System.out.println("Float value: " + marks);
        
        // Step 2: Float → Double (Upcasting)
        double doubleMarks = marks;
        System.out.println("Converted to double: " + doubleMarks);
        
        // Step 3: Double → Int (Downcasting)
        int intMarks = (int) doubleMarks;
        System.out.println("Converted to int: " + intMarks);
        
        // Step 4: Int → Char (ASCII Conversion)
        char ch = (char) intMarks;
        System.out.println("Character value: " + ch);

	}

}
