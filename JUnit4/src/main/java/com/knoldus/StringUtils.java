package com.knoldus;

public class StringUtils {

    // stringReverse method returns the reverse of a given string.
    String stringReverse(String originalString ){

        if(isStringEmpty(originalString))
            return "Invalid input";

        String reversedString="";
        for(Integer index=originalString.length()-1;index>=0;index--){
            reversedString+=originalString.charAt(index);
        }
        return reversedString;
    }

    // isStringEmpty method checks whether string is empty or not.
    boolean isStringEmpty(String originalString){
        if(originalString.length()==0)
            return true;
        else
            return false;
    }

    // isStringPalindrome method checks whether string is Palindrome or not.
    boolean isStringPalindrome(String originalString){

        if(isStringEmpty(originalString))
            return false;

        String reversedString=stringReverse(originalString);
        if(originalString.equals(reversedString))
            return true;
        else
            return false;

    }


}
