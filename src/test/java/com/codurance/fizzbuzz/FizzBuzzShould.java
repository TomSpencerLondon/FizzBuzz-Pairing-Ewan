package com.codurance.fizzbuzz;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzShould {
  FizzBuzz fizzBuzz;
  @Before
  public void setUp() {
    fizzBuzz = new FizzBuzz();
  }

  @Test
  @Parameters({
          "1, 1",
          "2, 2",
          "4, 4"
  })
  public void return_number_for_even(int input, String converted) {
    assertEquals(converted, fizzBuzz.convert(input));
  }


  @Test
  @Parameters({
          "3",
          "6",
          "9"
  })
  public void return_fizz_for_multiple_of_3(int input) {
    assertEquals("fizz", fizzBuzz.convert(input));
  }

  @Test
  @Parameters({
          "5",
          "10",
          "20"
  })
  public void return_buzz_for_multiple_of_5(int input) {
    assertEquals("buzz", fizzBuzz.convert(input));
  }

  @Test
  @Parameters({
          "15",
          "30",
          "45"
  })
  public void return_fizzbuzz_for_multiple_of_3_and_5(int input) {
    assertEquals("fizzbuzz", fizzBuzz.convert(input));
  }
}
