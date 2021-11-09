package com.company;
import java.util.*;
public class Main {
    public static int houses = 0;

    public static int getIntInput() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static int amountCalc(int houses) {
        int matchAmount = houses * 6;
        for (int i = 0; i < (houses - 1); i++) {
            matchAmount--;
        }
        return matchAmount;
    }

    public static void main(String[] args) {
        System.out.println("Enter number of matchstick houses:");
        System.out.println(amountCalc(getIntInput()));
    }
}
