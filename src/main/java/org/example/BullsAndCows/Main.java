package org.example.BullsAndCows;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите игру:");
        System.out.println("1. Игра с числами");
        System.out.println("2. Английская игра");
        System.out.println("3. Игра на русском языке");
        System.out.print("Введите номер игры: ");
        Game game;
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                game = new GameNumber();
                break;
            case 2:
                game = new EnglishGame();
                break;
            case 3:
                game = new RUgame();
                break;
            default:
                System.out.println("Неправильный выбор. Завершение программы.");
                return;
        }
        game.start(5, 5);
        scanner.nextLine(); // Очистка буфера после ввода номера игры
        while (!game.getGameStatus().equals(GameStatus.WINNER) && !game.getGameStatus().equals(GameStatus.LOSE)) {
            System.out.print("Введите значение: ");
            String scannerWord = scanner.nextLine();
            Answer answer = game.inputValue(scannerWord);
            System.out.println("Ответ: " + answer);
        }
        System.out.println("Статус игры: " + game.getGameStatus());
    }
}
