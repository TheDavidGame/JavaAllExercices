package ru.mirea.Exercise16;

public class Tester {
    static ATM atm;

    public static void main(String[] args) {

        Person person = new Person("Vlad", 100);
        System.out.println("Started  ");
        System.out.println(person.toString());

        for (int i = 0; i < 4; i++) {

            atm = new ATM();
            atm.setName("Thead " + i);

            atm.start();
            for(int j = 1; j <= 3; j++) {
                try {
                    Thread.sleep(i * 2 * 1000);
                } catch (InterruptedException e) {
                }

                atm.change_meter();
            }
            atm.interrupt();
        }

    }
}
