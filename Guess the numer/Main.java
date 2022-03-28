package com.company;//package com.company;
import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String name;
        int correctnum = 7;
        int guessnum;
        int count = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Hello! What is your name?");
        name = s.nextLine();

        System.out.println("Well, " + name + ", I am thinking of a number between 1-20.");
        System.out.println("Take a guess.");

        int x = 0;
        while (x == 0) {
            try {
                String tp = s.next();
                guessnum = Integer.parseInt(tp);

                if (guessnum > 20 || guessnum < 1) {
                    System.out.println("Please pick a number in range 1-20");
                }
                else if (guessnum > correctnum) {
                    System.out.println("Too high, try again");
                    count += 1;
                }
                else if (guessnum < correctnum) {
                    System.out.println("Too low, try again");
                    count += 1;
                }
                else if (guessnum == correctnum) {
                    count += 1;
                    System.out.println("Good job, " + name + "! You guessed my number in " + count + " guesses!");

                    int x2 = 0;
                    while (x2 == 0) {
                        System.out.println("Would you like to play again? (y or n)");
                        String ans = s.next();

                        if (Objects.equals(ans, "y")) {
                            count = 0;
                            correctnum = correctnum;
                            System.out.println("Pick a number between 1 and 20");
                            x2 = 1;
                        }
                        else if (Objects.equals(ans, "n")) {
                            x2 = 1;
                            x = 1;
                        }
                        else if (!Objects.equals(ans, "y") && !Objects.equals(ans, "n")){
                            System.out.println("Please answer y or n");
                        }
                    }
                }
            }
            catch (NumberFormatException n) {
            }
        }
        System.out.println();
        System.out.println("Goodbye!");
    }
}