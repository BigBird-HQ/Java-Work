package bank;

import java.util.List;

public class Bank {
    private int numberOfCustomers;
    private List<Account> accounts;

    public Bank() {
    }

    public Account registerCustomer(String firstName, String lastName, String pin) {
                     return new Account(firstName,lastName,pin);
              //    account.setAccountNumber();
      //  return numberOfCustomers;
    }

    public int getNumberOfCustomers() {
        return accounts.size();
    }



}
