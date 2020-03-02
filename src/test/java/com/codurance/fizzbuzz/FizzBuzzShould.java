package com.codurance.fizzbuzz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzShould {
  FizzBuzz fizzBuzz;
  @Before
  public void setUp() throws Exception {
    fizzBuzz = new FizzBuzz();
  }

  @Test
  public void return_one_for_one() {
    Assert.assertEquals("1", fizzBuzz.convert(1));
  }

  @Test
  public void return_two_for_two() {
    Assert.assertEquals("2", fizzBuzz.convert(2));
  }

  @Test
  public void return_four_for_four() {
    Assert.assertEquals("4", fizzBuzz.convert(4));
  }
}
