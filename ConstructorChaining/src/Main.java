public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();         // Constructor that is called, uses this() function
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