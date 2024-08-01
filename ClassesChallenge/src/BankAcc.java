public class BankAcc {
    private int acc_no = 123;
    private int acc_bal = 50_000;
    private String customerName = "Shreyas";
    private String eMail = "abc@gmail.com";
    private long phNo = 1234567812;
//    int withdraw = 0;

    public int getAcc_no(){
        return acc_no;
    }

    public int getAcc_bal() {
        return acc_bal;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getMail() {
        return eMail;
    }

    public long getPhNo() {
        return phNo;
    }

    public void setAcc_no(int acc_no){
        this.acc_no = acc_no;
    }

    public void setAcc_bal(int acc_bal) {
        this.acc_bal = acc_bal;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setPhNo(long phNo) {
        this.phNo = phNo;
    }

    public void depositFunds(int deposit){
            this.acc_bal+=deposit;
    }
    public int withdrawFunds(int withdraw){
        if (acc_bal<0)
            return -1;
        else {
            this.acc_bal -= withdraw;
            return withdraw;
        }
    }
}
