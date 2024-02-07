package org.example;

public class Answer {
    private int cowCounter;
    private int bullCounter;
    private Integer tryCount;
    private String mez;

    @Override
    public String toString() {
        return " Коров: "+cowCounter +" Быков: "+ bullCounter +" Осталось попыток :" +tryCount;
    }

    public Answer(int cowCounter, int bullCounter, Integer tryCount) {
        this.cowCounter = cowCounter;
        this.bullCounter = bullCounter;
        this.tryCount = tryCount;
    }
}


