package org.example;

import java.util.HashMap;
import java.util.Map;

public class PayStationImpl implements PayStation {

    private int insertedSoFar, timeBought, totalMoney;
    private final Map<Integer, Integer> coinMap;

    public PayStationImpl() {
        insertedSoFar = timeBought = totalMoney = 0;
        coinMap = new HashMap<>();

        System.out.println("PayStationImpl created.");
    }

    @Override
    public void addPayment(int coinValue) {
        switch (coinValue) {
            case 5:
            case 10:
            case 25:
                break;
        }

        coinMap.put(coinValue, coinMap.getOrDefault(coinValue, 0) + 1);

        Rate rate = PayStationAdmin.getAdmin().getRate();
        insertedSoFar += coinValue;
        timeBought = rate.calculateRate(insertedSoFar);
    }

    @Override
    public int readDisplay() {
        return timeBought;
    }

    @Override
    public Receipt buy() {
        Receipt r = new ReceiptImpl(timeBought);
        totalMoney += insertedSoFar;
        reset();
        return r;
    }

    private void reset() {
        timeBought = insertedSoFar = 0;
        coinMap.clear();
    }
}
