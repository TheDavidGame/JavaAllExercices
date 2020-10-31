package ru.mirea.exercise17_18;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Ex_1 {
    public void check(){

        String text = "abcdefghijklmnopqrstuv18340";
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        boolean found = Pattern.matches(text, in);
        if(found)
            System.out.println("Найдено");
        else
            System.out.println("Не найдено");

    }
}
