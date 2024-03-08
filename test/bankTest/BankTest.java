package bankTest;

import bank.Account;
import bank.Bank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    ArrayList<Account> accounts = new ArrayList<>();
    private Bank myBank;
    @BeforeEach
    public void myBank() {
        myBank = new Bank("Mavericks");
    }

    @Test
    public void customerCanBeRegisteredInTheBank_registerCustomerTest() {
        Account myAccount = myBank.registerCustomer("firstName", "lastName", "1234");
        assertEquals(1, myBank.getNumberOfCustomers());
    }
    @Test
    public void moreThanOneCustomerCanBeRegisteredInTheBank_registerCustomerTest() {
        Account myAccount = myBank.registerCustomer("firstName", "lastName" , "pin");
        Account myAccount1 = myBank.registerCustomer("firstName1", "lastName1" , "pin");
        assertEquals(2, myBank.getNumberOfCustomers());
    }
    @Test
    public void accountCanBeFoundInTheBank_findAccountTest() {
        Account myAccount = myBank.registerCustomer("firstName", "lastName", "pin");


    }

}
