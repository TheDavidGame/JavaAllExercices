package ru.mirea.exercise21_22.chairs;

public class MagicChairFabr implements Fabrik {
    @Override
    public Chair createChair() {
        return new MagicChair();
    }
}
