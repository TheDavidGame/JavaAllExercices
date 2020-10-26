package ru.mirea.Exercise16;

public class Person {
    private Account account;

    private String name;

    public Person(String name,int balance) {

        this.name = name;
        account = new Account();
        account.setBalance(balance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", balance=" + account.balance +
                '}';
    }
}
