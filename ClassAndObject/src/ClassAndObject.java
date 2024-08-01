public class ClassAndObject {
    public static void main(String[] args) {
        Car car = new Car();


        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setColor("black");
        car.setColor("Red");

        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());

        car.describeCar();


//        car.make = "Porsche";   Error, bcpz cannot acces private Members here.
//        car.model = "Carrera";
//        car.color = "Red";

        //But they can be accessed using setters and getters. We'll look into them now.
//        car.setMake("Porsche");
//        car.setModel("Carrera");
//        car.setDoors(2);
//        car.setColor("black");
//        car.setColor("Red");


    }
}
