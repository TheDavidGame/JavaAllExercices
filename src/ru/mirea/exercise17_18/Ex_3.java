package ru.mirea.exercise17_18;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex_3 {
    public void check_3() {

        String text = "([1-9]\\d+[.]?\\d{0,2})([ ])([U][S][D]|[R][U][R]|[E][U])";
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        Pattern a = Pattern.compile(text);
        Matcher b = a.matcher(in);
        while (b.find()) {
            System.out.println(b.group());
        }
    }
    }


