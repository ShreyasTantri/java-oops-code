public class Main {
    public static void main(String[] args) {

        BankAcc acc = new BankAcc();
        int i = acc.withdrawFunds(30_000);
        System.out.println(i);
    }
}
