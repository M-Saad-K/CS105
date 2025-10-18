import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class MerchantBank {

    ArrayList<BasicAccount> accounts;

    public MerchantBank() {

        this.accounts = new ArrayList<BasicAccount>();
    }

    public void openAccount(int accNum, char accType) {

        BasicAccount account;

        String Type = Character.toString(accType);

        if (Type.toLowerCase().equals("b")) {

            account = new BasicAccount(accNum, 0.0);

        } else if (Type.toLowerCase().equals("k")) {

            account = new KidsAcc(accNum, 0.0, 1);
        } else {

            account = new SaveAcc(accNum, 0.0, 3) ;
        }

        accounts.add(account);

    }

    private BasicAccount findAcc(int accNum) {


        for (BasicAccount index : accounts) {
            if (index.getAccNumber() == accNum) {

                return index;
            }
        }

        return null;
    }

    public boolean deposit(int accNum, double amount) {

        BasicAccount acc = findAcc(accNum);
        if (acc == null) {

            return false;
        } else {

            acc.deposit(amount);
            return true;
        }
    }

    public boolean withdraw(int accNum, double amount) {

        BasicAccount acc = findAcc(accNum);
        if (acc == null) {

            return false;
        } else {

            return acc.withdraw(amount);
        }
    }

    public double balance(int accNum) {

        BasicAccount acc = findAcc(accNum);

        if (acc == null) {

            double bal = -1.0;
            return bal;
        } else {

            return acc.getBalance();
        }
    }

    public double totalAssets() {

        double total = 0;
        for (BasicAccount index : accounts) {

            total += index.getBalance();
        }

        return total;

    }

    public void loadBank(){
        // Import text input from file, not OUTPUT!
        System.out.println("");
        try(Scanner bankCheck = new Scanner(new File("merchantbanker.txt")).useLocale(Locale.UK))
        {
            Account account;
            while (bankCheck.hasNext()) {
                    int accNum = bankCheck.nextInt();
                    char accType = bankCheck.next().charAt(0);
                    double amt = bankCheck.nextDouble();

                    /*
                    if (accType == 'B') {

                        account = new BasicAccount(accNum, amt);
                    } else if (accType == 'K') {

                        account = new KidsAcc(accNum, amt, 1);
                    } else {

                        account = new SaveAcc(accNum, amt, 3);
                    }
                    */

                    openAccount(accNum, accType);
                    deposit(accNum, amt);

                    // System.out.println("Your current account deposit is: " + amt);
                }

            bankCheck.close(); // Imporant statment, need to close the Scanner afterwards
        }
        catch (FileNotFoundException e) {

            System.out.println("Oh, lO0kS liKE u COuldN't fInd fIlE, OwO");
        }


    }

    public void howMuchDosh() {
        // We need a file output for the text we produced -> at dosh.txt
        // String printed out "Bank's total assets are: £" + totalAssets()
        // Merchantbanker.txt lines all read -> using loadBank, put in dosh.txt

        try
        {
            FileWriter wr = new FileWriter("dosh.txt");
            BufferedWriter bw = new BufferedWriter(wr);

                /*
                int i = 0;
                String message = "Bank's total assets are: £";
                String length_total = String.valueOf(totalAssets());

                while(message.length() + length_total.length() > i)
                {
                    bw.write(message.charAt(i));
                    bw.newLine();
                    i++;
                }

                 */

            bw.write("Bank's total assets are: £" + totalAssets());
            bw.newLine();
            bw.close();         // MUST CLOSE AFTERWARDS!!!
        }
        catch(IOException e){
            System.out.println("I cAn'T wrItE soorrie, OwO");
        }

    }


}
