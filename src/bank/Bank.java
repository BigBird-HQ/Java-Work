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
        Account myAccount = new Account(firstName + " " + lastName, 0, pin, accountNumber);
        accounts.add(myAccount);
        return myAccount;

    }

    private int generateAccountNumber() {
        return accountNumber += 1;
    }

    public int getNumberOfCustomers() {
        return accounts.size();
    }

    public int getAccount() {
        return accounts.size();
    }

    public Account findAccount(int accountNumber) {
        for (Account newAccount : accounts) {
            if (newAccount.getNumber() == accountNumber) return newAccount;
        }
        return null;
    }

    public void deposit(int number, int amount) {
        Account myAccount = findAccount(number);
        myAccount.deposit(amount);
    }

    public void withdraw(int number, int amount, String pin) {
        Account myAccount = findAccount(number);
        myAccount.withdraw(amount, pin);
    }

    public int checkBalance(int number, String pin) {
        Account myAccount = findAccount(number);
        return myAccount.checkBalance("pin");
    }

    public void remove(int number, String pin) {
        accounts.remove(findAccount(1));
    }

    public void transfer(Account account1, Account account2, int i, String pin) {
        Account sender = findAccount(1);
        sender.withdraw(2000, "pin");
        Account recipient = findAccount(2);
        recipient.deposit(2000);
    }
}
