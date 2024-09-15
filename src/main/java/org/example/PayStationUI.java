package org.example;

import java.util.Scanner;

public class PayStationUI {

    private final PayStationImpl ps;

    public PayStationUI() {
        this.ps = new PayStationImpl();
        System.out.println("PayStationUI created.");
    }

    public void startNewTransaction() {
        Scanner scanner = new Scanner(System.in);
        boolean done = false;

        System.out.println("Welcome to the Pay Station!");

        while (!done) {
            System.out.println("Insert coin (5, 10, 25), or type 'done' to finish: ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("done")) {
                done = true;
            } else {
                try {
                    int coin = Integer.parseInt(input);
                    if (coin == 5 || coin == 10 || coin == 25) {
                        ps.addPayment(coin);
                        System.out.println("Time bought so far: " + ps.readDisplay() + " minutes");
                    } else {
                        System.out.println("Invalid coin. Please insert 5, 10, or 25.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please insert a coin or type 'done' to finish.");
                }
            }
        }

        // After user finishes inserting coins, generate and display receipt
        Receipt receipt = ps.buy();
        System.out.println("Transaction complete. Here's your receipt: ");
        System.out.println("Time bought: " + receipt.value() + " minutes");
    }
}
