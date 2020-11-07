package ru.mirea.exercise19_20;

import java.util.Scanner;

public class Main19_20 {
    public static void main(String[] args) {

        Generate generate = new Generate();
        generate.beatifulplates();

        /*Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();*/
        generate.search("Т111ВУ64");

    }
}
