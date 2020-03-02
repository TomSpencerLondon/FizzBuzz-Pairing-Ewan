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
  public void return_1_for_1() {
    assertEquals("1", fizzBuzz.convert(1));
  }

  @Test
  public void return_1_for_2() {
    assertEquals("2", fizzBuzz.convert(2));
  }

  @Test
  public void return_4_for_4() {
    assertEquals("4", fizzBuzz.convert(4));
  }

  @Test
  public void return_fizz_for_3() {
    assertEquals("fizz", fizzBuzz.convert(3));
  }

  @Test
  public void return_fizz_for_6() {
    assertEquals("fizz", fizzBuzz.convert(6));
  }

  @Test
  public void return_fizz_for_9() {
    assertEquals("fizz", fizzBuzz.convert(9));
  }

  @Test
  public void return_buzz_for_5() {
    assertEquals("buzz", fizzBuzz.convert(5));
  }

  @Test
  public void return_buzz_for_10() {
    assertEquals("buzz", fizzBuzz.convert(10));
  }

  @Test
  public void return_buzz_for_20() {
    assertEquals("buzz", fizzBuzz.convert(20));
  }

  @Test
  public void return_fizzbuzz_for_15() {
    assertEquals("fizzbuzz", fizzBuzz.convert(15));
  }
}
