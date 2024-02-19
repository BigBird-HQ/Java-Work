package bankTest;

import bank.InsufficientFundsException;
import bank.InvalidAmountException;
import bank.InvalidPinException;
import bank.MyAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MyAccountTest {
    private MyAccount myAccount;

    @BeforeEach
    public void initialize() {
        myAccount = new MyAccount("Mesh", 0, "1234", 1);

    }

    @Test
    public void accountIsEmpty_ZeroBalanceTest() {

        assertEquals(0, myAccount.checkBalance("1234"));

    }

    @Test
    public void checkBalanceTest() {

        myAccount.deposit(2000);
        myAccount.checkBalance("1234");
        assertEquals(2000, myAccount.checkBalance("1234"));

    }

    @Test
    public void depositZeroAmount_balanceRemainsZeroTest() {

        assertEquals(0, myAccount.checkBalance("1234"));
        assertThrows(InvalidAmountException.class, ()->myAccount.deposit(0));
        assertEquals(0, myAccount.checkBalance("1234"));
    }

    @Test
    public void depositPositiveAmount_balanceIncreasesTest() {

        assertEquals(0, myAccount.checkBalance("1234"));
        myAccount.deposit(2000);
        assertEquals(2000, myAccount.checkBalance("1234"));
    }

    @Test
    public void depositPositiveAmountTwice_balanceIncreasesTest() {

        assertEquals(0, myAccount.checkBalance("1234"));
        myAccount.deposit(2000);
        myAccount.deposit(3000);
        assertEquals(5000, myAccount.checkBalance("1234"));
    }

    @Test
    public void depositNegativeBalance_throwExceptionTest() {

        assertEquals(0, myAccount.checkBalance("1234"));
        assertThrows(InvalidAmountException.class, ()->myAccount.deposit(-2000));
        assertEquals(0, myAccount.checkBalance("1234"));

    }
    @Test
    public void withdrawPositiveAmount_balanceDecreasesTest() {

        myAccount.deposit(2000);
        assertEquals(2000, myAccount.checkBalance("1234"));

        myAccount.withdraw(1000, "1234");
        assertEquals(1000, myAccount.checkBalance("1234"));
    }

    @Test
    public void withdrawPositiveAmount_amountGreaterThanBalanceTes_throwExceptionTest() {

        myAccount.deposit(2000);
        assertEquals(2000, myAccount.checkBalance("1234"));

        assertThrows(InsufficientFundsException.class, ()->myAccount.withdraw(3000,"1234"));
        assertEquals(2000, myAccount.checkBalance("1234"));
    }

    @Test
    public void withdrawZeroAmount_balanceRemainsUnchanged_throwExceptionTest() {

        myAccount.deposit(2000);
        assertEquals(2000, myAccount.checkBalance("1234"));
        assertThrows(InvalidAmountException.class, ()-> myAccount.withdraw(0,"1234"));
        assertEquals(2000, myAccount.checkBalance("1234"));

    }

    @Test
    public void withdrawNegativeAmount_balanceRemainsUnchanged_throwExceptionTest() {

        myAccount.deposit(2000);
        assertEquals(2000, myAccount.checkBalance("1234"));
        assertThrows(InvalidAmountException.class, ()->myAccount.withdraw(-2000, "1234"));
        assertEquals(2000, myAccount.checkBalance("1234"));
    }
    @Test
    public void enterPinToWithdraw_throwExceptionTest() {

        myAccount.deposit(2000);
        assertEquals(2000, myAccount.checkBalance("1234"));

        assertThrows(InvalidPinException.class, ()->myAccount.withdraw(1000, "1111"));
        assertEquals(2000, myAccount.checkBalance("1111"));
    }


}
