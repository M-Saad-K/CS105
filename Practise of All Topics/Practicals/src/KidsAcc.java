public class KidsAcc extends BasicAccount {

    private int bon;

    public KidsAcc(int acc, double bal, int rate, int b) {

        super(acc, bal, rate);
        bon = b;
    }

    public void setBonus(int newBonus) {

        bon = newBonus;
    }

    public int getBonus() {

        return bon;
    }

    public void deposit() {

        super.deposit(bon);
    }

}
