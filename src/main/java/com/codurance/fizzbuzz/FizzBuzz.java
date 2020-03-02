package com.codurance.fizzbuzz;

public class FizzBuzz {

  public String convert(int number) {
    if (number % 15 == 0) return "fizzbuzz";
    if (number % 5 == 0) return "buzz";
    if (number % 3 == 0) return "fizz";
    return String.valueOf(number);
  }
}
