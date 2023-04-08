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

    // testReverseString_Test1 method to test the expected reversedString.
    @Test
    public void testReverseString_Test1(){

        //action
        String reversedString=stringUtils.stringReverse("Sahil");
        assertEquals("lihaS",reversedString);

    }

    //testReverseString_Test2 method to test the stringReverse if the originalstring is empty
    @Test
    public void testReverseString_Test2(){

        String reversedString = stringUtils.stringReverse( "");
        assertEquals("Invalid input", reversedString);
    }

    // method to test isString empty
    @Test
    public void IsStringEmpty_Test1(){

        boolean result=stringUtils.isStringEmpty("");
        assertEquals(true,result);
    }

    // method to test isString empty with a non-empty string
    @Test
    public void IsStringEmpty_Test2(){

        boolean result=stringUtils.isStringEmpty("sahil");
        assertEquals(false,result);
    }


    // method to test string is Palindrome or not  with a palindrome string.
    @Test
    public void isStringPalindromeOrNot_Test1(){

        boolean result=stringUtils.isStringPalindrome("lol");
        assertEquals(true,result);
    }


    // method to test string is Palindrome or not  with a non-palindrome string.
    @Test public void isStringPalindromeorNot_Test2(){
        boolean result=stringUtils.isStringPalindrome("sahil");
        assertEquals(false,result);
    }


    // method to test string is Palindrome or not  with an empty string.
    @Test
    public void isStringPalindromeorNot_Test3(){
        boolean result=stringUtils.isStringPalindrome("");
        assertEquals(false,result);
    }
    @After
    public void tearDown(){
        System.out.println("test Done");
    }

}
