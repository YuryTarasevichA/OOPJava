package org.example.BullsAndCows;

public interface Game {
    //Интерфейс взаимодействий Game (должны быть описаны сигнатуры методов start, inputValue, getGameStatus)
    void start(Integer sizeWord, Integer maxTry);
    Answer inputValue (String value);
    GameStatus getGameStatus();

}
