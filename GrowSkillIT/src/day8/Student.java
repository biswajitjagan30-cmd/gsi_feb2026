package day8;

public class Student {
	String name;
	int age;
	float yearsOfExperience;
	void checkExperience()
	{
		if(yearsOfExperience>=5)
			System.out.println("Experienced");
		else
			System.out.println("less experiences");
	}
	Student()
	{
	System.out.println("constructor called!");	
	}
	Student(String name1,int age1, float yoe)
	{
		name = name1;
		age = age1;
		yearsOfExperience = yoe;
		System.out.println("constructor called!");
	}
	String getName()
	{
		return name;
	}
	void setName(String name1)
	{
		name = name1;
		
		}
	int getAge()
	{
		return age;
	}
	void setAge(int age1)
	{
		age = age1;
		
	}
	float getYearsOfExperience()
	{
		return yearsOfExperience;
		
	}
	void setYearsOfExperience(float yoe)
	{
		yearsOfExperience = yoe;
	}

	public static void main(String[] args) {
		

	}

}
