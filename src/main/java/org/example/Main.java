package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PayStationAdmin admin = PayStationAdmin.getAdmin();
        PayStationUI ui = new PayStationUI();

        admin.changeRate(new LinearRate1());
        ui.startNewTransaction();

        admin.changeRate(new LinearRate2());
        ui.startNewTransaction();

        admin.changeRate(new ProgressiveRate());
        ui.startNewTransaction();
    }
}
