package daily.coding.assignment;

public class Assignment_02042026 {
	
	//Circle
    double area(double radius) {
    	
    	return Math.PI*radius*radius;
    }
    // Rectangle
    int area(int length, int breath) {
    	return length*breath;
    }
    //square
    int area(int side) {
    	
    	return side*side;
    }
	
	

	public static void main(String[] args) {
	
		
		Assignment_02042026 obj = new Assignment_02042026();
		
		
		System.out.println("Circle Area: " + obj.area(5.0));
		System.out.println("Rectangle Area: " + obj.area(4,6));
		System.out.println("Square Area: " + obj.area(4));
		

	}

}
