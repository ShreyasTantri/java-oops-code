public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog(){
        super("German Shepard", "Big", 50);
    }
    public Dog(String type, double weight){
        this(type,weight,"Perky","Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight<15 ? "small" : (weight<35 ? "medium" : "large") ,weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {                              //This overrides the Animal class toString
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();                  //Lets to call a superclass method
    }
    public void makeNoise(){                              //This overrides the Animal class makeNoise

    }

    @Override
    public void move(String speed) {
        super.move(speed);                             //super.move(speed) means I am calling the move method on the parent class(Animal class)
        System.out.println("Dog's walk, run and wag their tail");
    }
}
