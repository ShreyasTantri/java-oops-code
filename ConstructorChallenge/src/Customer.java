public class Customer {
    String name;
    double creditLimit;
    String eMail;

    public String getName(){
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String geteMail() {
        return eMail;
    }

    public Customer(String name, double creditLimit, String eMail){
        this.name = name;
        this.creditLimit = creditLimit;
        this.eMail = eMail;
    }

    public Customer(){
        this("Shreyas3",20000.99, "shreyas@music.com");
    }

    public Customer(String eMail, String name) {
        this();
        this.eMail = eMail;
        this.name = name;
    }
}
