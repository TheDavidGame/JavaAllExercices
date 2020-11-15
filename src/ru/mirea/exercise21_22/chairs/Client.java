package ru.mirea.exercise21_22.chairs;

import java.util.Scanner;

public class Client implements Chair{
    private Chair chair ;
    public Client(){
        System.out.println("Введите число: " +'\n' +
                "1 - Magic Chair" + '\n' +
                "2 - Multyfunction Chair" + '\n' +
                "3 - Victorian Chair");
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();
        switch (in){
            case(1):
                Fabrik magicChair = new MagicChairFabr();
                 chair = magicChair.createChair();
                break;
            case(2):
                Fabrik multyfunctionFabr = new MultyfunctionFabr();
                 chair = multyfunctionFabr.createChair();
                break;
            case(3):
                Fabrik victorianChairFabr = new VictorianChairFabr();
                 chair = victorianChairFabr.createChair();
                break;
        }
    }

    @Override
    public void Sit() {
     chair.Sit();
    }
}
