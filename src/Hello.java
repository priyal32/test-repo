//package com.company;

import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner personName = new Scanner(System.in);
        String userName = personName.nextLine();
        Scanner personAge = new Scanner(System.in);
        String userAge = personAge.nextLine();
        Scanner personHabitat = new Scanner(System.in);
        String userHome = personHabitat.nextLine();

        System.out.print("Hello. What is your name? ");
        System.out.print("It's nice to meet you, " + userName + ". How old are you?");
        System.out.println(" I see that you are still quite young at only " + userAge + ".");
        System.out.print("Where do you live?");
        System.out.print(" Wow! I've always wanted to go to " + userHome + ". Thanks for chatting with me. Bye!");
    }

}
