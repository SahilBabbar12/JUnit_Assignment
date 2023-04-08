package com.knoldus;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class PersonTest {

    private Person person;
    @BeforeEach
    public void setup(){
        String name = "Sahil";
        int age = 23;
        String email = "Sahil@knoldus.com";
        person = new Person(name, age, email);
    }

    // Test to set and getName with not-null value.
    @Test
    void getNameTest1() {
        person.setName("Sahil Babbar");
        Assertions.assertEquals("Sahil Babbar", person.getName());
    }


    // Test to set and getName with null value.
    @Test
    void getNameTest2() {
        person.setName(null);
        Assertions.assertNull(person.getName());
    }

    // Test to  set and getAge with not-null value.
    @Test
    void getAgeTest1() {
        person.setAge(20);
        Assertions.assertEquals(20, person.getAge());
    }

    // Test to  set and getAge with null value.
    @Test

    void getAgeTest2() {
        person.setAge(0);
        Assertions.assertEquals(0, person.getAge());
    }

    // Test to set and getEmail with non-null value
    @Test
    void getEmailTest1() {
        person.setEmail("Sahil.Babbar@knoldus.com");
        Assertions.assertEquals("Sahil.Babbar@knoldus.com", person.getEmail());
    }

    //Test to set and getEmail with null value.
    @Test

    void getEmailTest2() {
        person.setEmail(null);
        Assertions.assertNull(person.getEmail());
    }

    // Test to get and setAge with positive integer
    @Test
    void setAgeTestForPositiveNumber() {
        person.setAge(23);
        Assertions.assertEquals(23, person.getAge());
    }

    // Test to get and setAge with negative integer
    @Test
    void setAgeTestForNegativeNumber() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> person.setAge(-11));
    }

    @Test
    public void setAgeTest_ifAgeIsZero() {
        int age = 0;
        person.setAge(age);
        Assertions.assertEquals(age, person.getAge());
    }

    @AfterEach
    public void tearDown(){
        System.out.println("Called After every test");
    }
}
