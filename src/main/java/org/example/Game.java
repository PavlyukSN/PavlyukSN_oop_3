package org.example;

public interface Game {
    void Start(Integer sizeWord, Integer tryCount);
    Answer inputValue(String value);
    GameStatus getGameStatus();
}
