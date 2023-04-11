package com.knoldus;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
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

    @Test
    @DisplayName("Test to set and getName with not-null value")
    void testgetName_given_nonNullValue() {
        person.setName("Sahil Babbar");
        Assertions.assertEquals("Sahil Babbar", person.getName());
    }

    @Test
    @DisplayName("Test to set and getName with null value")
    void testgetName_given_nullValue() {
        person.setName(null);
        Assertions.assertNull(person.getName());
    }

    @Test
    @DisplayName("Test to set and getAge with not-null value")
    void testgetAge_given_nonNullValue() {
        person.setAge(20);
        Assertions.assertEquals(20, person.getAge());
    }

    @Test
    @DisplayName("Test to set and getAge with null value")
    void testgetAge_given_nullValue() {
        person.setAge(0);
        Assertions.assertEquals(0, person.getAge());
    }

    @Test
    @DisplayName("Test to set and getEmail with non-null value")
    void testgetEmail_given_nonNullValue() {
        person.setEmail("Sahil.Babbar@knoldus.com");
        Assertions.assertEquals("Sahil.Babbar@knoldus.com", person.getEmail());
    }

    @Test
    @DisplayName("Test to set and getEmail with null value")
    void testgetEmail_given_nullValue() {
        person.setEmail(null);
        Assertions.assertNull(person.getEmail());
    }

    @Test
    @DisplayName("Test to get and setAge with positive integer")
    void testgetAge_given_PositiveNumber() {
        person.setAge(23);
        Assertions.assertEquals(23, person.getAge());
    }

    @Test
    @DisplayName("Test to get and setAge with negative integer")
    void testgetAge_given_NegativeNumber() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> person.setAge(-11));
    }

    @Test
    @DisplayName("Test to get and setAge with zero")
    public void testgetAge_givenAgeIsZero() {
        int age = 0;
        person.setAge(age);
        Assertions.assertEquals(age, person.getAge());
    }

    @AfterEach
    public void tearDown(){
        System.out.println("Called After every test");
    }
}
