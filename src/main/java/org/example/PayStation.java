package org.example;
import java.util.*;

public interface PayStation {
    public void addPayment(int coinValue);
    public int readDisplay();
    public Receipt buy();
}
