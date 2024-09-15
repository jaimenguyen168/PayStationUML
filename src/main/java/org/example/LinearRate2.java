package org.example;

public class LinearRate2 implements Rate {
    @Override
    public int calculateRate(double amount) {
        return (int)amount / 5;
    }
}
