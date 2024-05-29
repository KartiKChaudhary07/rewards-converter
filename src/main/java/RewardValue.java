public class RewardValue {
    private double cashValue;
    private double milesValue;
    private static final double CONVERSION_RATE = 0.01; // Example conversion rate

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / CONVERSION_RATE;
    }

    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = milesValue * CONVERSION_RATE;
        }
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    public static double convertCashToMiles(double cash) {
        return cash / CONVERSION_RATE;
    }

    public static double convertMilesToCash(double miles) {
        return miles * CONVERSION_RATE;
    }
}
