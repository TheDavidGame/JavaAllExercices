package ru.mirea.exercise19_20;

import java.util.*;

public class Generate {
    private final ArrayList<String> numbers = new ArrayList<>();
    private final HashSet<String> numbers_hash = new HashSet<String>();
    private final Set<String> numbers_tree = new TreeSet<>();
    public void beatifulplates(){
        String[] letter = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        for (int i=1;i<=199;i++){
            for(int j=1; j<=9; j++)
                for (String s : letter)
                {
                    String arr = s + (j) + (j) + (j) + s + s + (i);
                    numbers.add(arr);
                    numbers_hash.add(arr);
                    numbers_tree.add(arr);
                }
        }
        for (int i=1;i<=199;i++){
            for(int l=1; l<=9; l++)
                for (int j = 0; j < letter.length; j++) {
                    for (int h = 0; h < letter.length; h++) {
                        for (int k = 0; k < letter.length; k++) {
                            String arr = letter[j] + (l) + (l) + (l) + letter[h] +  letter[k] + (i);
                            numbers.add(arr);
                            numbers_hash.add(arr);
                            numbers_tree.add(arr);
                        }
                    }
                }
        }
    }

    public void search(String plate){
        boolean search;

        long startTime = System.nanoTime();
        search = numbers.contains(plate);
        long estimatedTime = System.nanoTime() - startTime;
        if (search){
            System.out.println("Найден, поиск занял "+estimatedTime+"нс");
        }
        else
            System.out.println("Не найден, поиск занял  "+estimatedTime+"нс");

        Collections.sort(numbers);
        int x;

        startTime = System.nanoTime();
        x=Collections.binarySearch(numbers,plate);
        estimatedTime = System.nanoTime() - startTime;
        if (x>0 && x<= numbers.size()){
            System.out.println("Найден, поиск занял "+estimatedTime+"нс");
        }
        else
            System.out.println("Не найден, поиск занял "+estimatedTime+"нс");

        startTime = System.nanoTime();
        search = numbers_hash.contains(plate);
        estimatedTime = System.nanoTime() - startTime;
        if (search){
            System.out.println("Найден, поиск занял "+estimatedTime+"нс");
        }
        else
            System.out.println("Не найден, поиск занял "+estimatedTime+"нс");

        startTime = System.nanoTime();
        search =(numbers_tree.contains(plate));
        estimatedTime = System.nanoTime() - startTime;
        if (search){
            System.out.println("Найден, поиск занял "+estimatedTime+"нс");
        }
        else
            System.out.println("Не найден, поиск занял "+estimatedTime+"нс");
    }
}

