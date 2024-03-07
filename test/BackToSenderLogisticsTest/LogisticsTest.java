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
        logistics.calculateDailyPayOn(40);

        assertEquals(11400, logistics.calculateDailyPayOn(40));

    }

    @Test
    public void dispatchRiderMadeLessThan60DailyCollection_successfulDeliveryTest() {
        logistics.calculateDailyPayOn(55);
        assertEquals(16000, logistics.calculateDailyPayOn(55));

    }
    @Test
    public void dispatchRiderMadeLessThan70DailyCollection_successfulDeliveryTest() {
        logistics.calculateDailyPayOn(67);
        assertEquals(21750, logistics.calculateDailyPayOn(67));

    }
    @Test
    public void dispatchRiderMadeMoreThan69DailyCollection_successfulDeliveryTest() {
        logistics.calculateDailyPayOn(80);
        assertEquals(45000, logistics.calculateDailyPayOn(80));
    }
    @Test
    public void negativeDailyCollectionRate_throwIllegalArgumentExceptionTest() {
        assertThrows(IllegalArgumentException.class, ()->logistics.calculateDailyPayOn(-60));
    }
}
