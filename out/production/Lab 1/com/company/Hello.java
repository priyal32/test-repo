package com.company;

import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner personName = new Scanner(System.in);
        System.out.print("Hello. What's your name?");
        String userName = personName.nextLine();
        System.out.print("It's nice to meet you," + userName + ". How old are you?");
        Scanner personAge = new Scanner(System.in);
        String userAge = personAge.nextLine();
        System.out.println("I see that you are still quite young at only" + userAge + ".");
        Scanner personHabitat = new Scanner(System.in);
        System.out.print("Where do you live?");
        String userHome = personHabitat.nextLine();
        System.out.print("Wow! I've always wanted to go to" + userHome + ". Thanks for chatting with me. Bye!");
    }

}
