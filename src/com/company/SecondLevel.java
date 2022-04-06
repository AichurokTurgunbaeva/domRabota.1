package com.company;

import java.util.Random;
import java.util.Scanner;

public class SecondLevel {
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
            case 1:
                System.out.println("" +
                        "\n+-------+" +
                        "\n|       |" +
                        "\n|   #   |" +
                        "\n|       |" +
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
        int userAbs = sum - Math.abs(sum - usersValue) * 2;
        System.out.println("On the dice fell " + sum + " points.");
        System.out.println("Result is " + sum + "-" + "abs(" + userDice1 +
                "-" + userDice2 + ")*2: " + userAbs + " points");

        int compDice1 = random.nextInt(1, 7);
        switch (compDice1) {
            case 1:
                System.out.println("" +
                        "\n+-------+" +
                        "\n|       |" +
                        "\n|   #   |" +
                        "\n|       |" +
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
        int compDice2 = random.nextInt(1, 7);
        switch (compDice2) {
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
        System.out.println("Computer predict number: ");
        int computerPredict = random.nextInt(2, 12);
        System.out.println(computerPredict);
        int sum2 = compDice1 + compDice2;
        int compAbs = sum2 - Math.abs(sum2 - computerPredict) * 2;
        System.out.println("On the dice fell " + sum2 + " points.");
        System.out.println("Result is " + sum2 + "-" + "abs(" + compDice1 +
                "-" + compDice2 + ")*2: " + compAbs + " points");

        System.out.println("----------------------------------------");
        int a = Math.max(userAbs,compAbs);
        if (userAbs>compAbs) {
            int c = userAbs-compAbs;
            System.out.println("Users win " + c + " points more." +
                                "Congratulations!");
        }
        if (userAbs<compAbs) {
            int d = compAbs - userAbs;
            System.out.println("Computer wins " + d + " points more." +
                               "\nCongratulations!");
        }

        }

    }
