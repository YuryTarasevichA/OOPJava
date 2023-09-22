package org.example.HomeWork5.Classic;

import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);
    public void calculate() {
        System.out.println("Введите первое число: ");
        double x = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double y = scanner.nextDouble();

        System.out.println("Выберите операцию (+, -, *, /): ");
        String operation = scanner.next();

        CalculMod calculator;

        switch (operation) {
            case "+":
                calculator = new SumMod();
                break;
            case "-":
                calculator = new DifferenceMod();
                break;
            case "*":
                calculator = new MultiplicationMod();
                break;
            case "/":
                calculator = new DivisionMod();
                break;
            default:
                System.out.println("Некорректная операция");
                return;
        }

        calculator.setX(x);
        calculator.setY(y);

        System.out.println("Результат: " + calculator.result());
    }

}
