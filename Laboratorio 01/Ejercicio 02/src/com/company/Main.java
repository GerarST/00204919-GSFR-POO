package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String word = "";
        word = in.nextLine();
        int counter = 0;
        int longword = word.length() -1;
        boolean isPalindrome = true;
        while ((counter < longword) && (isPalindrome)){
            if (word.charAt(counter) == word.charAt(longword)){
                counter++;
                longword--;
            }else
                isPalindrome = false;
        }
        if(isPalindrome)
            System.out.println("Es palindrome!");
        else if(!isPalindrome)
            System.out.println("No es palindrome!");

    }
}

