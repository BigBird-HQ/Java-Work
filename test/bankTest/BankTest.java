package bankTest;

import bank.Account;
import bank.Bank;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    ArrayList<Account> accounts = new ArrayList<>();

    @Test
    public void bankCanRegisterACustomer() {
        Bank myBank = new Bank();
        Account myAccount = myBank.registerCustomer("firstName", "lastName", "1234");
        assertEquals(1, myBank.getNumberOfCustomers());



    }
}
