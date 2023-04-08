package com.knoldus;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter  the string : ");
        String originalString = input.next();

        StringUtils stringUtils=new StringUtils();
        String reversedString=stringUtils.stringReverse(originalString);

        System.out.println("Reversed String: "+reversedString);

        boolean result= stringUtils.isStringEmpty("");
        System.out.println("Is String Empty: "+result);

        boolean isPalindrome=stringUtils.isStringPalindrome(originalString);
        System.out.println("Is string Palindrome: "+isPalindrome);

    }
}