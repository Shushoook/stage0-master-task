package com.epam.loops;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int cnt = 0;
        int result = 1;
        while (cnt != power) {
            result *= numberToPrint;
            cnt++;
        }
        System.out.println(result);

    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
        ;

    }

}
