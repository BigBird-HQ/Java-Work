package bank;

public class Account {

    private String name;
    private int balance;
    private String pin;
    private int number;

    public Account(String name, int balance, String pin, int number) {
        this.name =  name;
        this.balance = balance;
        this.pin = pin;
        this.number = number;
    }

    public Account(String firstName, String lastName, String pin){
                   this(firstName+" "+lastName,0, pin, 0);
    }

    public int checkBalance(String pin) {
        return balance;
    }

    public void deposit(int amount) {
        invalidAmount(amount);
        balance += amount;
    }

    public void withdraw(int amount, String pin) {
        validate(amount, pin);
        insufficientFunds(amount);
        invalidAmount(amount);
        balance -= amount;
    }

    private void validate(int amount, String pin) {
        if (!pin.equals(this.pin)) throw new InvalidPinException("Incorrect PIN! Enter correct PIN");

    }

    private static void invalidAmount(int amount) {
        if (amount <= 0) throw new InvalidAmountException("Invalid Withdrawal Amount!");
    }

    private void insufficientFunds(int amount) {
        if (amount > balance) throw new InsufficientFundsException("Insufficient Balance!");
    }


}
