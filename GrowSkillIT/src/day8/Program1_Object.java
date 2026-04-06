package day8;

public class Program1_Object {

	public static void main(String[] args) {
	
		Student s1 = new Student();
		s1.name = "Rajat";
		s1.age = 30;
		s1.yearsOfExperience = 7.6F;
		s1.checkExperience();
		System.out.println(s1.name+":"+s1.age+":"+s1.yearsOfExperience);
		Student s2 = new Student("Rahul",28,12.7F);
		System.out.println(s2.name+":"+s2.age+":"+s2.yearsOfExperience);
		Student s3 = new Student();
		s3.setName("Puja");
		System.out.println(s3.getName());
		
		

	}

}
