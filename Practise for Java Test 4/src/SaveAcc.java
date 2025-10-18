

public class SaveAcc extends BasicAccount {

    private int intRate;    // Field for Interest Rate

    public SaveAcc(int acc, double bal, int i) {

        super(acc, bal);
        intRate = i;
    }

    public void setRate(int newRate) {

        intRate = newRate;
    }

    public int getRate() {

        return intRate;
    }

    public void addInterest() {

        double inter = intRate / (100.0 * getBalance());    // interest rate / (100 * current balance)

        super.deposit(inter);
    }

}
