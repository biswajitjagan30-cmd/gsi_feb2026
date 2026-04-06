package daily.coding.assignment;

public class Assignment_Employee06042026 {
	
	//  Private variables
    private String name;
    private int id;
    private String department;
	
    // 🔹 Default constructor
    Assignment_Employee06042026() {
        name = "Unknown";
        id = 0;
        department = "Not Assigned";
    }

    // Parameterized constructor (all fields)
    Assignment_Employee06042026(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }
    // Overloaded constructor (name + id)
    Assignment_Employee06042026(String name, int id) {
        this.name = name;
        this.id = id;
        this.department = "General";
    }

    // 🔹 Getters
    public String getName() { return name; }
    public int getId() { return id; }
    public String getDepartment() { return department; }

    // 🔹 Setters
    public void setName(String name) { this.name = name; }
    public void setId(int id) { this.id = id; }
    public void setDepartment(String department) { this.department = department; }

    // 🔹 Main method
    public static void main(String[] args) {

        // Employee 1 (default)
    	Assignment_Employee06042026 e1 = new Assignment_Employee06042026();

        // Employee 2 (all values)
    	Assignment_Employee06042026 e2 = new Assignment_Employee06042026("Priya", 101, "HR");

        // Employee 3 (name + id)
    	Assignment_Employee06042026 e3 = new Assignment_Employee06042026("Rahul", 102);

        // Print details
        System.out.println("Employee 1: " + e1.getName() + ", " + e1.getId() + ", " + e1.getDepartment());
        System.out.println("Employee 2: " + e2.getName() + ", " + e2.getId() + ", " + e2.getDepartment());
        System.out.println("Employee 3: " + e3.getName() + ", " + e3.getId() + ", " + e3.getDepartment());

        // Update Employee 1 using setters
        e1.setName("Anjali");
        e1.setId(103);
        e1.setDepartment("Finance");

        // Print updated details
        System.out.println("Updated Employee 1: " + e1.getName() + ", " + e1.getId() + ", " + e1.getDepartment());
    }
}

	
	

