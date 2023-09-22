package org.example.HomeWork5;

import org.example.HomeWork5.Classic.View;
import org.example.HomeWork5.Complex.ComplexView;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choise;
        do {
            System.out.println("Выберете действие: ");
            System.out.println("1. Классический калькулятор ");
            System.out.println("2. Комплексный калькулятор ");
            System.out.println("3. Выход");
            choise = scanner.nextInt();
            switch (choise) {
                case 1:
                    View view = new View();
                    view.calculate();
                    break;
                case 2:
                    ComplexView complexView = new ComplexView();
                    complexView.program();
                    break;
                case 3:
                    System.out.println("Выход из программы...");
                    break;
                default:
                    logger.log(Level.SEVERE, "Неправильный выбор.");
                    System.out.println("Неправильный выбор. Попробуйте еще раз.");
                    break;
            }
        } while (choise != 3);
    }
}
