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
    void testgetName_givenNonNullValue_shouldReturnInputName() {
        person.setName("Sahil Babbar");
        Assertions.assertEquals("Sahil Babbar", person.getName());
    }

    @Test
    @DisplayName("Test to set and getName with null value")
    void testgetName_givenNullValue_shouldReturnNull() {
        person.setName(null);
        Assertions.assertNull(person.getName());
    }

    @Test
    @DisplayName("Test to set and getAge with not-null value")
    void testgetAge_givenNonNullValue_shouldReturnInputAge() {
        person.setAge(20);
        Assertions.assertEquals(20, person.getAge());
    }

    @Test
    @DisplayName("Test to set and getAge with null value")
    void testgetAge_givenNullValue_shouldReturnNull() {
        person.setAge(0);
        Assertions.assertEquals(0, person.getAge());
    }

    @Test
    @DisplayName("Test to set and getEmail with non-null value")
    void testgetEmail_givenNonNullValue_shouldReturnInputEmail() {
        person.setEmail("Sahil.Babbar@knoldus.com");
        Assertions.assertEquals("Sahil.Babbar@knoldus.com", person.getEmail());
    }

    @Test
    @DisplayName("Test to set and getEmail with null value")
    void testgetEmail_givenNnullValue_shouldReturnNull() {
        person.setEmail(null);
        Assertions.assertNull(person.getEmail());
    }

    @Test
    @DisplayName("Test to get and setAge with positive integer")
    void testsetAge_givenPositiveNumber_shouldSetInputAge() {
        person.setAge(23);
        Assertions.assertEquals(23, person.getAge());
    }

    @Test
    @DisplayName("Test to get and setAge with negative integer")
    void testsetAge_givenNegativeNumber_shouldThrow_IllegalArgumentException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> person.setAge(-11));
    }

    @Test
    @DisplayName("Test to get and setAge with zero")
    public void testsetAge_givenAgeIsZero_shouldSetAgeAsZero() {
        int age = 0;
        person.setAge(age);
        Assertions.assertEquals(age, person.getAge());
    }

    @AfterEach
    public void tearDown(){
        System.out.println("Called After every test");
    }
}
