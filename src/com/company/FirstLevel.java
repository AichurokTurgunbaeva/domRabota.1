package com.company;

import java.util.Random;
import java.util.Scanner;

public class FirstLevel {
    static void startGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("                                 ");
        System.out.println("***        Start game      ***");
        System.out.println("Predict amount of points (2...12): ");
        int usersValue = scanner.nextInt(12);
        System.out.println("User rolls the dices...  ");
        Random random = new Random();
        int userDice1 = random.nextInt(1,7);
        switch (userDice1) {
            case 1 -> System.out.println("" +
                    "\n+-------+" +
                    "\n|       |" +
                    "\n|   #   |" +
                    "\n|       |" +
                    "\n+-------+");
            case 2 -> System.out.println("" +
                    "\n+-------+" +
                    "\n|     # |" +
                    "\n|       |" +
                    "\n|  #    |" +
                    "\n+-------+");
            case 3 -> System.out.println("" +
                    "\n+-------+" +
                    "\n|     # |" +
                    "\n|   #   |" +
                    "\n| #     |" +
                    "\n+-------+");
            case 4 -> System.out.println("" +
                    "\n+-------+" +
                    "\n|   #   |" +
                    "\n| #   # |" +
                    "\n|   #   |" +
                    "\n+-------+");
            case 5 -> System.out.println("" +
                    "\n+-------+" +
                    "\n|  #  # |" +
                    "\n|   #   |" +
                    "\n|  #  # |" +
                    "\n+-------+");
            case 6 -> System.out.println("" +
                    "\n+-------+" +
                    "\n| #   # |" +
                    "\n| #   # |" +
                    "\n| #   # |" +
                    "\n+-------+");
        }
        int userDice2 = random.nextInt(1,7);
        switch (userDice2) {
            case 1:
                System.out.println("" +
                        "\n+-------+" +
                        "\n|       |" +
                        "\n|   #   |" +
                        "\n+-------+");
                break;
            case 2:
                System.out.println("" +
                        "\n+-------+" +
                        "\n|     # |" +
                        "\n|       |" +
                        "\n|  #    |" +
                        "\n+-------+");
                break;
            case 3:
                System.out.println("" +
                        "\n+-------+" +
                        "\n|     # |" +
                        "\n|   #   |" +
                        "\n| #     |" +
                        "\n+-------+");
                break;
            case 4:
                System.out.println("" +
                        "\n+-------+" +
                        "\n|   #   |" +
                        "\n| #   # |" +
                        "\n|   #   |" +
                        "\n+-------+");
                break;
            case 5:
                System.out.println("" +
                        "\n+-------+" +
                        "\n|  #  # |" +
                        "\n|   #   |" +
                        "\n|  #  # |" +
                        "\n+-------+");
                break;
            case 6:
                System.out.println("" +
                        "\n+-------+" +
                        "\n| #   # |" +
                        "\n| #   # |" +
                        "\n| #   # |" +
                        "\n+-------+");
                break;
        }

        int sum = (userDice1 + userDice2);
        int b = sum - Math.abs(sum - usersValue) * 2;
        System.out.println("On the dice fell " + sum + " points.");
        System.out.println("Result is " + userDice1 + "-" + "abs(" + userDice1 +
                "-" + userDice2 + ")*2: " + b + " points");
        if (b > 0) {
            System.out.println("User wins!");
        } else {
            System.out.println("User lost!");
        }
    }
}
