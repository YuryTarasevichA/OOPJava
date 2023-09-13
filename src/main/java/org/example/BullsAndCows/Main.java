package org.example.BullsAndCows;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
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
                logger.log(Level.SEVERE, "Неправильный выбор. Завершение программы.");
                System.out.println("Неправильный выбор. Завершение программы.");
                return;
        }
        game.start(5, 5);
        scanner.nextLine(); // Очистка буфера после ввода номера игры
        while (!game.getGameStatus().equals(GameStatus.WINNER) && !game.getGameStatus().equals(GameStatus.LOSE)) {
            System.out.print("Введите значение: ");
            String scannerWord = scanner.nextLine();
            Answer answer = game.inputValue(scannerWord);
            logger.log(Level.INFO, "Введено значение: {0}, ответ: {1}", new Object[]{scannerWord, answer});
            System.out.println("Ответ: " + answer);
        }
        logger.log(Level.INFO, "Статус игры: {0}", game.getGameStatus());
        System.out.println("Статус игры: " + game.getGameStatus());
    }
    private static void viewGameHistory() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя файла с логами: ");
        String fileName = scanner.nextLine();
        File logFile = new File(fileName);
        if (!logFile.exists()) {
            logger.log(Level.SEVERE, "Файл не найден: {0}", fileName);
            System.out.println("Файл не найден: " + fileName);
            return;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(logFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Ошибка чтения файла: {0}", fileName);
            System.out.println("Ошибка чтения файла: " + fileName);
        }
    }

    private static void saveGameHistory(Game game) {
        Logger gameLogger = Logger.getLogger(game.getClass().getName());
        FileHandler fileHandler;
        try {
            fileHandler = new FileHandler(game.getClass().getName() + "_history.log", true);
            gameLogger.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
            gameLogger.log(Level.INFO, "Игра завершена со статусом: {0}", game.getGameStatus());
        } catch (IOException e) {
                logger.log(Level.SEVERE, "Ошибка создания файла истории игры.", e);
            }
        }
}

