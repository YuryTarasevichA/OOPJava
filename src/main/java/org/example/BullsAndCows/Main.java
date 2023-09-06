package org.example.BullsAndCows;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new GameNumber(); // реализация интерфейса Game, объеденияем объекты по свойствам
        game.start(5,5);
        Scanner scanner = new Scanner(System.in);
        while (!game.getGameStatus().equals(GameStatus.WINNER)
                &&!game.getGameStatus().equals(GameStatus.LOSE)) {
            String scanerWord = scanner.nextLine();
            Answer answer = game.inputValue(scanerWord);
            System.out.println("answer = " + answer);
//            System.out.println("game.inputValue(scanerWord) = " + game.inputValue(scanerWord));
        }
        System.out.println(game.getGameStatus());
    }
}
