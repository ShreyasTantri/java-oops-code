/*Question:
Create a Java class named Student that has the following private instance variables:
name (String)
age (int)
grade (double)

Implement constructor overloading by creating three constructors:

A no-argument constructor that initializes the instance variables with default values.
A constructor that takes only name as a parameter and initializes name while setting default values
for age and grade.
A constructor that takes all three parameters (name, age, and grade) to initialize all instance variables.
Implement the appropriate getters for each of these instance variables.

In the main method, demonstrate creating Student objects using each of the three constructors. Then,
retrieve and print these values using the getters.

Requirements:
The no-argument constructor should initialize name to "Unknown", age to 0, and grade to 0.0.Theconstructor that takes only name should initialize name with the provided value and set
age to 18 and grade to 0.0 by default.The constructor that takes all three parameters should initialize
the instance variables with the provided values.*/

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Shreyas2");
        Student student3 = new Student("Shreyas3", 28, 99.9);

        System.out.println("1st Constructor Details: \n");
        System.out.println("Name : "+student1.getName()+"\n"+
                "Age : "+student1.getAge()+"\n"+
                "Grade : "+student1.getGrade()+"\n");

        System.out.println("2nd Constructor Details: \n");
        System.out.println("Name : "+student2.getName()+"\n"+
                "Age : "+student2.getAge()+"\n"+
                "Grade : "+student2.getGrade()+"\n");

        System.out.println("3rd Constructor Details: \n");
        System.out.println("Name : "+student3.getName()+"\n"+
                "Age : "+student3.getAge()+"\n"+
                "Grade : "+student3.getGrade()+"\n");
    }
}
