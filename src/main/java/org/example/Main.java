package org.example;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        AbsrtactGame ag;
        Scanner vote;
        try (var writer = new FileWriter("log.txt")) {
            ag = null;
            String rn = System.lineSeparator();

            System.out.println("1 - Сыграть с цифрами, 2 - Кирилица,  3 - Латинца");

            vote = new Scanner(System.in);
            int raund = vote.nextInt();
            writer.write("1 - Сыграть с цифрами, 2 - Кирилица,  3 - Латинца. Выбрано: " + raund + rn);
            if (raund == 1) {
                ag = new NumberGame();
            } else if (raund == 2) {
                ag = new LetterGame();
            } else if (raund == 3) {
                ag = new EngGame();
            }
            assert ag != null;
            ag.Start(4, 3);
            System.out.println("Введи значение четыре символа");
            writer.write("Введи значение четыре символа"+ rn);
            Scanner value = new Scanner(System.in);
            while (ag.getGameStatus().equals(GameStatus.START)) {
                Answer answer = ag.inputValue(value.nextLine());
                System.out.println(answer);
                writer.write(value + rn);
            }
            if (ag.getGameStatus().equals(GameStatus.WIN)) {
                System.out.println("Вы победили ");
                writer.write("Вы победили ");
            } else if (ag.getGameStatus().equals(GameStatus.LOOSE)) {
                System.out.println("Вы проиграли ");
                writer.write("Вы проиграли ");
            } else {
                System.out.println("Неопознаный статус ");
            }
        }
    }
}