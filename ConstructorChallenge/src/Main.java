public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Shreyas1",10000.88, "abc@gmail.com");         // Constructor that is called, uses this() function
        Customer customer2 = new Customer();
        Customer customer3 = new Customer("acb@gmail.com", "Shreyas2");

        System.out.println("1st Constructor Details: \n");
        System.out.println("Name : "+customer1.getName()+"\n"+
                "Credit limit : "+customer1.getCreditLimit()+"\n"+
                "email : "+customer1.geteMail()+"\n");

        System.out.println("2nd Constructor Details: \n");
        System.out.println("Name : "+customer2.getName()+"\n"+
                "Credit limit : "+customer2.getCreditLimit()+"\n"+
                "email : "+customer2.geteMail()+"\n");

        System.out.println("3rd Constructor Details: \n");
        System.out.println("Name : "+customer3.getName()+"\n"+
                "Credit limit : "+customer3.getCreditLimit()+"\n"+
                "email : "+customer3.geteMail()+"\n");
    }
}