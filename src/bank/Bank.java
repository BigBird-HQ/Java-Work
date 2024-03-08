package bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Account> accounts;
    private int accountNumber = 0;
    private int numberOfCustomers;


    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();

    }

    public Account registerCustomer(String firstName, String lastName, String pin) {
        int accountNumber = generateAccountNumber();
        Account myAccount = new Account(firstName +" "+ lastName, 0, pin, accountNumber);
        accounts.add(myAccount);
        return myAccount;
              //    account.setAccountNumber();
      //  return numberOfCustomers;
    }

    private int generateAccountNumber() {
        return accountNumber += 1;
    }

    public int getNumberOfCustomers() {
        return accounts.size();
    }


}
