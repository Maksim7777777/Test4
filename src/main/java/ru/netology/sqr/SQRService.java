package ru.netology.sqr;

public class SQRService {
    public int calc(int min, int max) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int checkedNumber = i * i;
            if (checkedNumber >= min) {
                if (checkedNumber <= max) {
                    counter++;
                }
            }
        }
        return counter;
    }

}
