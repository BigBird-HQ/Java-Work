package bankTest;

import bank.Account;
import bank.InsufficientFundsException;
import bank.InvalidAmountException;
import bank.InvalidPinException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {
    private Account myAccount;

    @BeforeEach
    public void initialize() {
        myAccount = new Account("Mesh", 0, "correctPin", 1000);

    }

    @Test
    public void accountIsEmpty_ZeroBalanceTest() {

        assertEquals(0, myAccount.checkBalance("correctPin"));

    }

    @Test
    public void checkBalanceTest() {

        myAccount.deposit(2000);
        myAccount.checkBalance("correctPin");
        assertEquals(2000, myAccount.checkBalance("correctPin"));

    }

    @Test
    public void depositZeroAmount_balanceRemainsZeroTest() {

        assertEquals(0, myAccount.checkBalance("correctPin"));
        assertThrows(InvalidAmountException.class, ()->myAccount.deposit(0));
        assertEquals(0, myAccount.checkBalance("correctPin"));

    }

    @Test
    public void depositPositiveAmount_balanceIncreasesTest() {

        assertEquals(0, myAccount.checkBalance("correctPin"));
        myAccount.deposit(2000);
        assertEquals(2000, myAccount.checkBalance("correctPin"));

    }

    @Test
    public void depositPositiveAmountTwice_balanceIncreasesTest() {

        assertEquals(0, myAccount.checkBalance("correctPin"));
        myAccount.deposit(2000);
        myAccount.deposit(3000);
        assertEquals(5000, myAccount.checkBalance("correctPin"));

    }

    @Test
    public void depositNegativeBalance_invalidAmountExceptionTest() {

        assertEquals(0, myAccount.checkBalance("correctPin"));
        assertThrows(InvalidAmountException.class, ()->myAccount.deposit(-2000));
        assertEquals(0, myAccount.checkBalance("correctPin"));

    }

    @Test
    public void withdrawPositiveAmount_balanceDecreasesTest() {

        myAccount.deposit(2000);
        assertEquals(2000, myAccount.checkBalance("correctPin"));

        myAccount.withdraw(1000, "correctPin");
        assertEquals(1000, myAccount.checkBalance("correctPin"));

    }

    @Test
    public void withdrawPositiveAmount_amountGreaterThanBalance_insufficientFundsExceptionTest() {

        myAccount.deposit(2000);
        assertEquals(2000, myAccount.checkBalance("correctPin"));

        assertThrows(InsufficientFundsException.class, ()->myAccount.withdraw(3000,"correctPin"));
        assertEquals(2000, myAccount.checkBalance("correctPin"));

    }

    @Test
    public void withdrawZeroAmount_balanceRemainsUnchanged_InvalidAmountExceptionTest() {

        myAccount.deposit(2000);
        assertEquals(2000, myAccount.checkBalance("correctPin"));
        assertThrows(InvalidAmountException.class, ()-> myAccount.withdraw(0,"correctPin"));
        assertEquals(2000, myAccount.checkBalance("correctPin"));

    }

    @Test
    public void withdrawNegativeAmount_balanceRemainsUnchanged_invalidAmountExceptionTest() {

        myAccount.deposit(2000);
        assertEquals(2000, myAccount.checkBalance("correctPin"));
        assertThrows(InvalidAmountException.class, ()->myAccount.withdraw(-2000, "correctPin"));
        assertEquals(2000, myAccount.checkBalance("correctPin"));

    }

    @Test
    public void enterPinToWithdraw_invalidPinExceptionTest() {

        myAccount.deposit(2000);
        assertEquals(2000, myAccount.checkBalance("correctPin"));

        assertThrows(InvalidPinException.class, ()->myAccount.withdraw(1000, "incorrectPin"));
        assertEquals(2000, myAccount.checkBalance("incorrectPin"));

    }

//    @Test
//    public void twoAccountsCanExistIndependently_zeroBalanceTest() {
//
//        assertEquals(0, myAccount.checkBalance("correctPin"));
//        assertEquals(0, myAccount2.checkBalance("correctPin"));
//
//    }
//
//    @Test
//    public void depositInBothAccounts_balanceIncreaseInBothAccountTest() {
//
//        assertEquals(0, myAccount.checkBalance("correctPin"));
//        myAccount.deposit(2000);
//        assertEquals(2000, myAccount.checkBalance("correctPin"));
//
//        assertEquals(0, myAccount2.checkBalance("correctPin"));
//        myAccount2.deposit(3000);
//        assertEquals(3000, myAccount2.checkBalance("correctPin"));
//        assertEquals(2000, myAccount.checkBalance("correctPin"));
//
//    }




}
