package BackToSenderLogistics;

public class Logistics {
    int basePay = 5000;
    public int calculateDailyPayOn(int successfulDeliveryRate) {
        if (successfulDeliveryRate < 0) throw new IllegalArgumentException("Invalid input");
        if (successfulDeliveryRate < 50) {
            return successfulDeliveryRate * 160 + basePay;
        }
        else if (successfulDeliveryRate < 60) {
            return successfulDeliveryRate * 200 + basePay;
        }
        else if (successfulDeliveryRate < 70) {
            return successfulDeliveryRate * 250 + basePay;
        }
        else {
            return successfulDeliveryRate * 500 + basePay;
        }
    }


}
