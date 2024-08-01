public class Student {
    private String name = "Shreyas1";
    private int age = 25;
    private double grade = 39.5;

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    public Student(){    // default values
        this("Shreyas4", 30, 93.8);
//        System.out.println("this() was used here");
//        this.name = "Unknown";
//        this.age = 0;
//        this.grade = 0.0;
    }

    public Student(String name) {
        this.name = name;
        this.age = 18;
        this.grade = 0.0;
    }

    public Student(String name, int age, double grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
