package BackToSenderLogisticsTest;

import BackToSenderLogistics.Logistics;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LogisticsTest {
    private Logistics logistics;
    @BeforeEach
    public void setUp() {
        logistics = new Logistics();
    }

    @Test
    public void dispatchRiderMadeLessThan50DailyCollection_successfulDeliveryTest() {
        logistics.calculateDailyPay(40);

        assertEquals(11400, logistics.calculateDailyPay(40));

    }

    @Test
    public void dispatchRiderMadeLessThan60DailyCollection_successfulDeliveryTest() {
        logistics.calculateDailyPay(55);
        assertEquals(16000, logistics.calculateDailyPay(55));

    }
    @Test
    public void dispatchRiderMadeLessThan70DailyCollection_successfulDeliveryTest() {
        logistics.calculateDailyPay(67);
        assertEquals(21750, logistics.calculateDailyPay(67));

    }
    @Test
    public void dispatchRiderMadeMoreThan69DailyCollection_successfulDeliveryTest() {
        logistics.calculateDailyPay(80);
        assertEquals(45000, logistics.calculateDailyPay(80));
    }
    @Test
    public void negativeDailyCollectionRate_throwIllegalArgumentExceptionTest() {
        assertThrows(IllegalArgumentException.class, ()->logistics.calculateDailyPay(-60));
    }
}
