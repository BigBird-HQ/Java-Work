package bank;

public class MyAccount {

    private String name;
    private int balance;
    private String pin;
    private int number;

    public MyAccount(String name, int balance, String pin, int number) {
        this.name =  name;
        this.balance = balance;
        this.pin = pin;
        this.number = number;
    }

    public int checkBalance(String pin) {
        return balance;
    }

    public void deposit(int amount) {
        invalidAmount(amount);
        balance += amount;
    }

    public void withdraw(int amount, String pin) {
        insufficientFunds(amount);
        invalidAmount(amount);
        validatePin(amount, pin);
        balance -= amount;
    }

    private void validatePin(int amount, String pin) {
        if (!pin.equals(this.pin)) throw new InvalidPinException("Incorrect PIN! Enter correct PIN");

    }

    private static void invalidAmount(int amount) {
        if (amount <= 0) throw new InvalidAmountException("Invalid Withdrawal Amount!");
    }

    private void insufficientFunds(int amount) {
        if (amount > balance) throw new InsufficientFundsException("Insufficient Balance!");
    }


}
