package day1;

public class Program5_DataTypeCasting {

	public static void main(String[] args) {
		
		// Type casting = converting one data type into another.
		
		// up casting // Implicit casting
		
		// 	Converting smaller → larger type
		
		int age = 32;
		float ageFloat = age;
		System.out.println(ageFloat);
		
	
		int num = 100;
		long numLong = num;
		System.out.println(numLong);
		
		// Down Casting // Explicit type casting
		// Converting larger → smaller type
		
		float height = 162.6f;
		int heightInt = (int)height;
		System.out.println(heightInt);
		
		
		
		long phoneNumber = 1234567893564L;
		int phoneInt = (int)phoneNumber;
		System.out.println(phoneInt);
		
		// e
		
		
		
		
		

	}

}
