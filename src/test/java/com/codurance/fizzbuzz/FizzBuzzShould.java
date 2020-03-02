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
}
