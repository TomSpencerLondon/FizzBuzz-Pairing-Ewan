package com.codurance.fizzbuzz;

import org.junit.Assert;
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
  public void return_one_for_one() {
    assertEquals("1", fizzBuzz.convert(1));
  }

  @Test
  public void return_two_for_two() {
    assertEquals("2", fizzBuzz.convert(2));
  }

  @Test
  public void return_four_for_four() {
    assertEquals("4", fizzBuzz.convert(4));
  }

  @Test
  public void return_fizz_for_multiple_of_three() {
    assertEquals("fizz", fizzBuzz.convert(3));
  }
}
