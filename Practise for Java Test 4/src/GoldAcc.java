public class GoldAcc extends SaveAcc{

    private double min;
    public GoldAcc(int acc, double bal) {

        super(acc, bal);
    }

    public void setMinBalance(double minB){

        min = minB;
    }

    public double getMinBalance(){

        return min;
    }

    public boolean withdraw(double amount){

        if (getBalance() >= min) {

            double bal = getBalance() - amount;
            return true;
        } else {

            return false;
        }
    }
}
