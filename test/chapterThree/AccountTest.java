package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void depositNegativeAmount_BalanceRemainUnchangedTest() {

        Account account = new Account();
        account.setDeposit(-5000);
        assertEquals(0, account.getBalance());


    }
}
