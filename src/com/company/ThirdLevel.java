package com.company;

import java.util.Random;
import java.util.Scanner;

public class ThirdLevel {

    static void startGame() {
        int userCounter = 0;
        int compCounter = 0;
        int roundCounter = 4;


        for (int i = 0; i < 4; i++) {
            roundCounter--;
            if (roundCounter > 0) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("                                 ");
                System.out.println("***        Start game      ***");
                System.out.println("Predict amount of points (2...12): ");
                int usersValue = scanner.nextInt(12);
                System.out.println("User rolls the dices...  ");
                Random random = new Random();
                int userDice1 = random.nextInt(1, 7);
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
                int userDice2 = random.nextInt(1, 7);
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
                    case 1 -> System.out.println("" +
                            "\n+-------+" +
                            "\n|       |" +
                            "\n|   #   |" +
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
                System.out.println("Computer predict number: ");
                int computerPredict = random.nextInt(2, 12);
                System.out.println(computerPredict);
                int sum2 = compDice1 + compDice2;
                int compAbs = sum2 - Math.abs(sum2 - computerPredict) * 2;
                System.out.println("On the dice fell " + sum2 + " points.");
                System.out.println("Result is " + sum2 + "-" + "abs(" + compDice1 +
                        "-" + compDice2 + ")*2: " + compAbs + " points");

                System.out.println("----------------------------------------");

                userCounter = userCounter + userAbs;
                System.out.println("--- Current score ---");
                System.out.println("User: " + userCounter + " points.");
                compCounter = compCounter + compAbs;
                System.out.println("Computer: " + compCounter + " points.");

                if (userCounter > compCounter) {
                    int c = userCounter - compCounter;
                    System.out.println("User is ahead by " + c + " points!");
                }
                if (userCounter < compCounter) {
                    int d = compCounter - userCounter;
                    System.out.println("Computer is ahead by  " + d + " points!");
                } else {

                    System.out.println("----------------------------------------");

                    System.out.println(
                            "***    Finish game   ***");
                    System.out.println(
                            "\nRound   |    User      | Computer    " +
                                    "\n-------------------------------------" +
                                    "\n        | Predicted: " + usersValue + " | Predicted: " + computerPredict + "            " +
                                    "\n ~ 1 ~  | Dice: " + sum + "   | Dice: " + sum2 + "           " +
                                    "\n        | Result:" + userAbs + "   | Result: " + compAbs + "            " +
                                    "\n-------------------------------------" +
                                    "\n        | Predicted: " + usersValue + " | Predicted: " + computerPredict + "            " +
                                    "\n ~ 2 ~  | Dice: " + sum + "             | Dice:" + sum2 + "            " +
                                    "\n        | Result: " + userAbs + " | Result:" + compAbs + "            " +
                                    "\n-------------------------------------" +
                                    "\n        | Predicted: " + usersValue + " | Predicted: " + computerPredict + "           " +
                                    "\n ~ 3 ~  | Dice: " + sum + "       | Dice:" + sum2 + "            " +
                                    "\n        | Result: " + userAbs + "      | Result:" + compAbs + "            " +
                                    "\n-------------------------------------" +
                                    "\n Total  |     Points: " + userCounter + " | Points: " + compCounter + "    ");
                }

            }
        }

    }
}