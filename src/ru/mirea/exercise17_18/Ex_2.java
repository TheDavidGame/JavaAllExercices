package ru.mirea.exercise17_18;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Ex_2 {
    public void check_2(){
    String text = "([a-f]+[A-F]+:){3}+([0-9]{2}+:){2}+[0-9]{2}";
    Scanner scanner = new Scanner(System.in);
    String in = scanner.nextLine();
    boolean found = Pattern.matches(text, in);
        if(found)
            System.out.println("Найдено");
        else
                System.out.println("Не найдено");
    }
}
