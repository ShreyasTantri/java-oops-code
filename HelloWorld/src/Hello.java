public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Tim");

        boolean isAlien = true;

        if(!isAlien) {
            System.out.println("It's not an Alien");

            System.out.print("I am Scared of Aliens");
        }

        boolean isCar = false;
        if(!isCar){
            System.out.println("This is not supposed to happen");
        }
        //operand1 ? operand2 : operand3

        int ageClient = 20;
        String ageText = ageClient >= 18 ? "Over 18" : "Kid";

//        if(ageText)
            System.out.println(ageText);

            
    }
}
