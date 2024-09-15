package org.example;

public class LinearRate1 implements Rate {
    @Override
    public int calculateRate(double amount) {
        return (int)(amount * 2) / 5;
    }
}
