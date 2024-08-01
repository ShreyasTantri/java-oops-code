public class PrecedenceChallenge {
    public static void main(String[] args) {
        double var1 = 20.00d;
        double var2 = 80.00d;
        double add = (var1 + var2) * 100.00d ;
        System.out.println("Total = " + add);
        double rem = add % 40.00d; // 10,000 / 40 = 250.00
        System.out.println("Remainder = " + rem);

        boolean isNoRem = (rem == 0.00) ? true : false;
        System.out.println("isNoRem = " + isNoRem);

        if(!isNoRem)
            System.out.println("Got some remainder");






    }


}
