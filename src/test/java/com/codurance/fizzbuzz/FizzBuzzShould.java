package com.codurance.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzShould {
  FizzBuzz fizzBuzz;
  @Before
  public void setUp() {
    fizzBuzz = new FizzBuzz();
  }

  @Test
  public void return_number_if_not_multiple_of_three_or_five() {
    int number = 1;
    assertEquals(String.valueOf(number), fizzBuzz.convert(number));
  }

  @Test
  public void return_fizz_for_a_multiple_of_three() {
    int number = 3;
    assertEquals("fizz", fizzBuzz.convert(3));
  }

  @Test
  public void return_buzz_for_a_multiple_of_five() {
    int number = 5;
    assertEquals("buzz", fizzBuzz.convert(number));
  }

  @Test
  public void returns_fizzbuzz_for_a_multiple_of_15() {
    int number = 15;
    assertEquals("fizzbuzz", fizzBuzz.convert(number));
  }
}
