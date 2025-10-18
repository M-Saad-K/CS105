

public class KidsAcc extends BasicAccount {

    private int bon;

    public KidsAcc(int acc, double bal, int b){

        super(acc, bal);
        bon = b;
        System.out.println("bon" + bon);
    }

    public void setBonus(int newBonus){

        bon = newBonus;
    }

    public int getBonus(){

        return bon;
    }

    public void deposit(double dep) {

        super.deposit(dep + bon);
    }

}
