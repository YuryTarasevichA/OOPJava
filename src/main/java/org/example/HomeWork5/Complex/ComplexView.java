package org.example.HomeWork5.Complex;

import java.util.Scanner;

public class ComplexView {
    public void program() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        float a, b;
        ComplexNumber complex1, complex2, result;

        do {
            System.out.println("Выберите операцию:");
            System.out.println("1. Сложение");
            System.out.println("2. Разница");
            System.out.println("3. Умножение");
            System.out.println("4. Деление");
            System.out.println("5. Выход");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Введите действительную и мнимую части первого комплексного числа:");
                    a = scanner.nextFloat();
                    b = scanner.nextFloat();
                    complex1 = new ComplexNumber(a, b);

                    System.out.println("Введите действительную и мнимую части первого комплексного числа:");
                    a = scanner.nextFloat();
                    b = scanner.nextFloat();
                    complex2 = new ComplexNumber(a, b);

                    result = ComplexSum.add(complex1, complex2);

                    System.out.println(result.toString());
                    break;
                case 2:
                    System.out.println("Введите действительную и мнимую части первого комплексного числа:");
                    a = scanner.nextFloat();
                    b = scanner.nextFloat();
                    complex1 = new ComplexNumber(a, b);

                    System.out.println("Введите действительную и мнимую части первого комплексного числа:");
                    a = scanner.nextFloat();
                    b = scanner.nextFloat();
                    complex2 = new ComplexNumber(a, b);

                    result = ComplexDifference.subtract(complex1, complex2);

                    System.out.println(result.toString());
                    break;
                case 3:
                    System.out.println("Введите действительную и мнимую части первого комплексного числа:");
                    a = scanner.nextFloat();
                    b = scanner.nextFloat();
                    complex1 = new ComplexNumber(a, b);

                    System.out.println("Введите действительную и мнимую части первого комплексного числа:");
                    a = scanner.nextFloat();
                    b = scanner.nextFloat();
                    complex2 = new ComplexNumber(a, b);

                    result = ComplexMulty.multiply(complex1, complex2);

                    System.out.println(result.toString());
                    break;
                case 4:
                    System.out.println("Введите действительную и мнимую части первого комплексного числа:");
                    a = scanner.nextFloat();
                    b = scanner.nextFloat();
                    complex1 = new ComplexNumber(a, b);

                    System.out.println("Введите действительную и мнимую части первого комплексного числа:");
                    a = scanner.nextFloat();
                    b = scanner.nextFloat();
                    complex2 = new ComplexNumber(a, b);

                    result = ComplexDivision.divide(complex1, complex2);

                    System.out.println(result.toString());
                    break;
                case 5:
                    System.out.println("Выход из калькулятора комплексных чисел");
                    break;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, попробуйте еще раз.");
            }
        } while (choice != 5);
    }
}
