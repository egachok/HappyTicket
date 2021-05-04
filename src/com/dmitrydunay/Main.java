//2) Найти количество счастливых билетиков на трамвай от 000001 до 999999
// (те у которых сумма первых 3 цифр равна сумме последних 3).
package com.dmitrydunay;

public class Main {

    public static void main(String[] args) {

        int quantity = 0;

        for (int i = 1; i < 1_000_000; i++) {
            int i1 = i / 100_000 % 10,
                    i2 = i / 10_000 % 10,
                    i3 = i / 1000 % 10,
                    i4 = i / 100 % 10,
                    i5 = i / 10 % 10,
                    i6 = i % 10;
            if ((i1 + i2 + i3) == (i4 + i5 + i6)) {
                quantity++;
            }
        }
        System.out.println("Quantity of lucky tickets is: " + quantity);
    }
}