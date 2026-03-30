package weeklyassignments;

public class Datatype_assignments1 {

	public static void main(String[] args) {
		 // Step 1: Float value
        float marks = 87.6f;
        System.out.println("Float value: " + marks);
        
        // Step 2: Float → Double (Upcasting)
        double doubleMarks = marks;
        System.out.println("Double value: " + doubleMarks);
        
        // Step 3: Double → Int (Downcasting)
        int intMarks = (int) doubleMarks;
        System.out.println("Integer value: " + intMarks);
        
        // Step 4: Int → Char (ASCII Conversion)
        char gradeChar = (char) intMarks;
        System.out.println("Character value: " + gradeChar);

	}

}
