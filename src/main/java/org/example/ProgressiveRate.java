package org.example;

public class ProgressiveRate implements Rate {
    @Override
    public int calculateRate(double amount) {
        if (amount < 150) {
            return (int)(amount * 2) / 5;
        } else if (amount < 350) {
            return (int)((amount - 150) * ((double) 3 / 10) + 60);
        }

        return (int)(amount - 350) / 5 + 120;
    }
}
