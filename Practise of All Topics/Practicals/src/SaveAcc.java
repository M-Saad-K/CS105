public class SaveAcc extends BasicAccount {

    private int intRate;

    public SaveAcc(int acc, double bal, int rate) {

        super(acc, bal, rate);
        intRate = rate;
    }

    public void setRate(int newRate) {

        intRate = newRate;
    }

    public int getRate() {

        return intRate;
    }

    public void addInterest() {

        // Current int + current bal
        // intRate/(100*current bal)
        // Use super deposit method to add interest
        double inter  = super.getBalance() * intRate/100;
        super.deposit(inter);


    }
}
