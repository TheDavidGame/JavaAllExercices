package ru.mirea.exercise21_22.numbers;

public class ComplexNumbersStart implements ComplexNumber{
    private double first;
    private double second;

    public double getFirst() {
        return first;
    }

    public double getSecond() {
        return second;
    }

    public ComplexNumbersStart(double first, double second) {
        this.first = first;
        this.second = second;
    }
    static ComplexNumbersStart sum(ComplexNumbersStart n1, ComplexNumbersStart n2){
        return new ComplexNumbersStart(n1.getFirst() + n2.getFirst(), n1.getSecond() + n2.getSecond());
    };
    static ComplexNumbersStart divide(ComplexNumbersStart n1, ComplexNumbersStart n2){
        ComplexNumbersStart temp = new ComplexNumbersStart(n2.getFirst(), (-1) * n2.getSecond());
        temp = ComplexNumbersStart.multy(n1, temp);
        double denominator = n2.getFirst() * n2.getFirst() + n2.getSecond() * n2.getSecond();
        return new ComplexNumbersStart(temp.getFirst() / denominator, temp.getSecond() / denominator);
    };
    static ComplexNumbersStart multy(ComplexNumbersStart n1, ComplexNumbersStart n2){
        return new ComplexNumbersStart(n1.getFirst() * n2.getFirst() - n1.getSecond() * n2.getSecond(),
                n1.getFirst() * n2.getSecond() + n1.getSecond() * n2.getFirst());
    };
    static ComplexNumbersStart subtract(ComplexNumbersStart n1, ComplexNumbersStart n2){
        return new ComplexNumbersStart(n1.getFirst() - n2.getFirst(), n1.getSecond() - n2.getSecond());
    };
    public String sign() {
        if (second > 0) return " + ";
        else return " - ";
    }

    @Override
    public String tString() {
        String string;
        if (second == 1 || second == -1) {
            if (first == 0) {
                string = sign() + "i";
            } else {
                string = Double.toString(first) + sign() + "i";
            }
        } else {
            string = Double.toString(first) + sign() + Double.toString(Math.abs(second)) + "i";
        }
        return string;
    }
}
