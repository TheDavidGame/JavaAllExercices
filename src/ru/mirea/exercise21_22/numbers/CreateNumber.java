package ru.mirea.exercise21_22.numbers;

public class CreateNumber implements FabrikNumber {


    @Override
    public ComplexNumbersStart createnumber() {
        double n1 = 3;
        double n2 = 2;

        return new ComplexNumbersStart(n1,n2);
    }
}
