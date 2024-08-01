/*Question:
Create a Java class named Student that has the following private instance variables:

name (String)
age (int)
grade (double)

Implement the appropriate getters and setters for each of these instance variables. Also,
include a main method to demonstrate creating a Student object, setting its values using the setters,
and then retrieving and printing these values using the getters.
*/


public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Joy");
        student.setAge(25);
        student.setGrade(44.5);

        System.out.println("Name : " + student.getName() + "\n" +
                "Age : "+ student.getAge()+ "\n" +
                "Grade : "+ student.getGrade());
    }
}
