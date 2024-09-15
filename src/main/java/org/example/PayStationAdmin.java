package org.example;

public class PayStationAdmin {
    private static PayStationAdmin admin;
    private Rate rate;

    public static PayStationAdmin getAdmin() {
        if (admin == null) {
            admin = new PayStationAdmin();
            System.out.println("PayStationAdmin singleton instance created.");
        }
        return admin;
    }

    public Rate getRate() {
        return rate;
    }

    public void changeRate(Rate newRate) {
        this.rate = newRate;
    }
}
