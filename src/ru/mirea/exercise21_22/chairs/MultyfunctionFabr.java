package ru.mirea.exercise21_22.chairs;

public class MultyfunctionFabr implements Fabrik {
    @Override
    public Chair createChair() {

        return new MultyfunctionChair();
    }
}
