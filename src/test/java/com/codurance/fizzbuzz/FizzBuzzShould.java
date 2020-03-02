package com.codurance.fizzbuzz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzShould {
  FizzBuzz fizzBuzz;
  @Before
  public void setUp() throws Exception {
    fizzBuzz = new FizzBuzz();
  }

  @Test
  public void returns_number_if_not_multiple_of_three_or_five() {
    int number = 1;
    assertEquals(number, fizzBuzz.convert(number));
  }
}
