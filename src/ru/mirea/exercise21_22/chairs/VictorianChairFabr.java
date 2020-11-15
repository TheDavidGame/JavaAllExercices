package ru.mirea.exercise21_22.chairs;

public class VictorianChairFabr  implements Fabrik{
    @Override
    public Chair createChair() {

        return new VictorianChair();
    }
}
