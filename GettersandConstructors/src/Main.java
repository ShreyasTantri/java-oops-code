/*Question:
Create a Java class named Student that has the following private instance variables:

name (String)
age (int)
grade (double)

Implement a constructor that initializes all three instance variables.
Implement the appropriate getters for each of these instance variables.
In the main method, demonstrate creating a Student object using the constructor, and then
retrieving and printing these values using the getters.

Requirements:

The constructor should take three parameters to initialize the name, age, and grade instance variables.
Implement the getters as getName(), getAge(), and getGrade().*/

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Jack",26, 44.7);
        System.out.println("Name : " + student.getName() + "\n" +
                "Age : "+ student.getAge() + "\n" +
                "Grade : " + student.getGrade());
    }
}
