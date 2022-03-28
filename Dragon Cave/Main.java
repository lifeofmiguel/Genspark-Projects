package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        //introduced player to game
        System.out.println("Hey adventurer you are in a land of dragons. In front of you, you see two caves." +
                "In one cave, the dragon is friendly and will share his treasure with you." +
                "The other dragon is greedy and hungry and will eat you on sight. Which cave will you go into? (1/2)");
        int selection = input.nextInt();
        if(selection == 1) {
            System.out.println("Good choice you are now rich");
        } else {
            System.out.println("You approach the cave ... " +
                    "It is dark and spooky ..." +
                    "A large dragon jumps out infront of you! He opens his jaw and ..." +
                    "Gobbles you down in one bite!");
        }
    }
}
