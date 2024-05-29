class RewardValueTests {

    public void testCashToMilesConversion() {
        double cashValue = 100;
        double expectedMiles = cashValue / RewardValue.CONVERSION_RATE;
        double actualMiles = RewardValue.convertCashToMiles(cashValue);
        assertEquals(expectedMiles, actualMiles, 0.001);
    }

    private void assertEquals(double expectedMiles, double actualMiles, double v) {
    }


    public void testMilesToCashConversion() {
        double milesValue = 10000;
        double expectedCash = milesValue * RewardValue.CONVERSION_RATE;
        double actualCash = RewardValue.convertMilesToCash(milesValue);
        assertEquals(expectedCash, actualCash, 0.001);
    }


    public void testGetCashValue() {
        RewardValue reward = new RewardValue(100);
        assertEquals(100, reward.getCashValue(), 0.001);
    }


    public void testGetMilesValue() {
        RewardValue reward = new RewardValue(10000, true);
        assertEquals(10000, reward.getMilesValue(), 0.001);
    }
}
