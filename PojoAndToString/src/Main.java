public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Student s= new Student("S12345" + i,
                    switch (i){
                case 1 -> "Jim";
                case 2 -> "Jack";
                case 3 -> "Shreyas";
                case 4 -> "Swathi";
                case 5 -> "Subramanya";
                default -> "Anonymous";
                },
            "25/03/2002", "Java Masterclass");

            System.out.println(s.toString());  //Implicitly s is actually s.toString. Can also be written as s.toString.
            // System.out.println(s);            ---> Same o/p as SOP(s.toString);

        }
    }
}
