package practical_15_solutions;

public interface Account {
    public double getBalance();
    public void deposit(double deposit);
    public boolean withdraw(double amount);
    public int getAccNumber();
}

