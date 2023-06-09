package com.knoldus;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class StringUtilsTest {
    StringUtils stringUtils;

    @Before
    public void setup(){
        stringUtils=new StringUtils();
    }

    // method to test the stringReverse with non-null value.
    @Test
    public void testReverseString_givenNonNull_shouldReverseGivenString(){
        //action
        String reversedString=stringUtils.stringReverse("Sahil");
        assertEquals("lihaS",reversedString);

    }
    // method to test the stringReverse if the originalstring is empty
    @Test
    public void testReverseString_givenEmptyString_shouldReturnInvalid(){
        String reversedString = stringUtils.stringReverse( "");
        assertEquals("Invalid input", reversedString);
    }

    // method to test the string is empty or not with an empty string.
    @Test
    public void testisStringEmpty_givenEmptyString_shouldReturnTrue(){
        boolean result=stringUtils.isStringEmpty("");
        assertEquals(true,result);
    }

    // method to test isString empty with a non-empty string
    @Test
    public void testisStringEmpty_givenNonNull_shouldReturnFalse(){
        boolean result=stringUtils.isStringEmpty("sahil");
        assertEquals(false,result);
    }

    // method to test string is Palindrome or not  with a palindrome string.
    @Test
    public void testisStringPalindrome_givenPalindrome_shouldReturnTrue(){
        boolean result=stringUtils.isStringPalindrome("lol");
        assertEquals(true,result);
    }

    // method to test string is Palindrome or not  with a non-palindrome string.
    @Test public void testisStringPalindrome_givenNonPalindrome_shouldReturnFalse(){
        boolean result=stringUtils.isStringPalindrome("sahil");
        assertEquals(false,result);
    }

    // method to test string is Palindrome or not  with an empty string.
    @Test
    public void testisStringPalindrome_givenEmptyString_shouldReturnFalse(){
        boolean result=stringUtils.isStringPalindrome("");
        assertEquals(false,result);
    }
    @After
    public void tearDown(){
        System.out.println("test Done");
    }

}
