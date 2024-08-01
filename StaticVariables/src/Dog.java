public class Dog {

    private static String name;

    public Dog(String name){
        Dog.name = name;
    }

//When you call new Dog("rex"), the string "rex" is passed to the constructor.
//This string literal is stored in the string pool, which is a part of the heap memory.

    public void printName(){
        System.out.println("name = " + name);
    }
}
