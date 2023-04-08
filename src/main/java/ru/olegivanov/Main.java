package ru.olegivanov;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(
                calc.newFormula()
                        .addOperand(5)
                        .addOperand(15)
                        .calculate(Calculator.Operation.MULT)
                        .result()
        );

        Ints calc2 = new IntsCalculator();
        System.out.println("Test for sum  = "+calc2.sum(250,250));
        System.out.println("Test for mult = "+calc2.mult(10,33));
        System.out.println("Test for pow  = "+calc2.pow(11,2));
    }
}