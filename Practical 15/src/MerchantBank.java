package practical_15_solutions;

import java.util.ArrayList;

public class MerchantBank {

    private ArrayList<Account> accounts;

    public MerchantBank() {
        accounts = new ArrayList<Account>();
    }


    public void openAccount(int number, char type) {
        Account account;
        if (type == 'K')
            account = new KidsAcc(number, 0.0, 1);
        else if (type == 'S')
            account = new SaveAcc(number, 0.0, 3);
        else
            account = new BasicAccount(number, 0.0);
        accounts.add(account);
    }

    public boolean deposit(int number, double deposit) {
        Account account = findAcc(number);
        if (account != null) {
            account.deposit(deposit);
            return true;
        }
        else
            return false;
    }
    public boolean withdraw(int number, double amount) {
        Account account = findAcc(number);
        if (account != null)
            return account.withdraw(amount);
        else
            return false;
    }

    public double balance(int number) {
        Account account = findAcc(number);
        if (account != null)
            return account.getBalance();
        else
            return -1;
    }

    public double totalAssets() {
        double total = 0;
        for (Account account : accounts) {
            total = total + account.getBalance();
        }
        return total;
    }

    private Account findAcc(int number) {
        for (Account account : accounts) {
            if (account.getAccNumber() == number)
                return account;
        }
        return null;
    }
}
