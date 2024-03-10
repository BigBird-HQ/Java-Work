package bankTest;

import bank.Account;
import bank.Bank;
import bank.InsufficientFundsException;
import bank.InvalidAmountException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
        Account foundAccount = myBank.registerCustomer("firstName", "lastName", "pin");
        assertEquals(1, myBank.getAccount());
        assertEquals(foundAccount, myBank.findAccount(1));
        assertEquals("firstName lastName", foundAccount.getName());
    }
    @Test
    public void depositPositiveAmountInTheBank_depositTest() {
        Account myAccount = myBank.registerCustomer("firstName", "lastName", "pin");
        myBank.deposit(myAccount.getNumber(), 2000);
        assertEquals(2000, myAccount.checkBalance("pin"));
    }
    @Test
    public void depositNegativeAmount_throwExceptionTest() {
        Account myAccount = myBank.registerCustomer("firstName", "lastName", "pin");
        assertThrows(InvalidAmountException.class, ()->myBank.deposit(myAccount.getNumber(), -2000));
        assertEquals(0,  myAccount.checkBalance("pin"));
    }
    @Test
    public void depositZeroAmount_throwException() {
        Account myAccount = myBank.registerCustomer("firstName", "lastName", "pin");
        assertThrows(InvalidAmountException.class, ()->myBank.deposit(myAccount.getNumber(), 0));
        assertEquals(0,  myAccount.checkBalance("pin"));
    }
    @Test
    public void withdrawPositiveAmount_withdrawTest() {
        Account myAccount = myBank.registerCustomer("firstName", "lastName", "pin");
        myBank.deposit(myAccount.getNumber(), 2000);
        myBank.withdraw(myAccount.getNumber(), 1000, "pin");
        assertEquals(1000,myAccount.checkBalance("pin"));
    }
    @Test
    public void withdrawNegativeAmount_throwException() {
        Account myAccount = myBank.registerCustomer("firstName", "lastName", "pin");
        assertThrows(InvalidAmountException.class, ()->myBank.withdraw(myAccount.getNumber(), -2000, "pin"));
        assertEquals(0, myAccount.checkBalance("pin"));
    }
    @Test
    public void withdrawZeroAmount_throwException() {
        Account myAccount = myBank.registerCustomer("firstName", "lastName", "pin");
        assertThrows(InvalidAmountException.class, ()->myBank.withdraw(myAccount.getNumber(), 0, "pin"));
        assertEquals(0, myAccount.checkBalance("pin"));
    }
    @Test
    public void withdrawAmountMoreThanAvailableBalance_throwExceptionTest() {
        Account myAccount = myBank.registerCustomer("firstName", "lastName", "pin");
        myBank.deposit(myAccount.getNumber(), 2000);
        assertEquals(2000, myAccount.checkBalance("pin"));
        assertThrows(InsufficientFundsException.class, ()->myBank.withdraw(myAccount.getNumber(), 5000, "pin"));
        assertEquals(2000, myAccount.checkBalance("pin"));
    }
    @Test
    public void checkBalanceTest() {
        Account myAccount = myBank.registerCustomer("firstName", "lastName", "pin");
        assertEquals(0, myBank.checkBalance(myAccount.getNumber(), "pin"));
    }
    @Test
    public void accountCanBeRemoved_removeAccountTest() {
        Account myAccount = myBank.registerCustomer("firstName", "lastName", "pin");
        assertEquals(1, myBank.getAccount());
        myBank.remove(myAccount.getNumber(), "pin");
        assertEquals(0, myBank.getAccount());
    }
    @Test
    public void transferBetweenTwoAccounts_transferTest() {
        Account account1 = myBank.registerCustomer("firstName", "lastName", "pin");
        Account account2 = myBank.registerCustomer("firstName1", "lastName", "pin");
        myBank.deposit(1, 5000);
        myBank.transfer(account1, account2, 2000, "pin");
        assertEquals(3000, account1.checkBalance("pin"));
        assertEquals(2000, account2.checkBalance("pin"));
    }
    @Test
    public void changePinTest() {
    }
}
