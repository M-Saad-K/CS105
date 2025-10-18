public class GoldAcc extends SaveAcc {

    private double min;

    public GoldAcc(int acc, double bal, int rate, int m) {

        super(acc, bal, rate);
        min = m;
    }

    public void setMinBalance(double minB) {

        min = minB;
    }

    public double getMinBalance() {

        return min;
    }

    @Override
    public boolean withdraw(double amount) {

        if(super.getBalance() < min){
            return false;
        } else {

            super.withdraw(amount);
            return true;
        }
    }
}
