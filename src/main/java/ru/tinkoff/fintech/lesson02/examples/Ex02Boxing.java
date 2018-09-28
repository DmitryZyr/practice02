package ru.tinkoff.fintech.lesson02.examples;

public class Ex02Boxing {
    static boolean isEqualP(int x, int y) {
        return x == y;
    }

    static boolean isEqualB(Integer x, Integer y) {
        return x == y;
    }

    public static void main(String[] arg) {
        System.out.println(isEqualP(421, 421));
        System.out.println(isEqualB(421, 421));
    }
}
