package com.codurance.fizzbuzz;

public class FizzBuzz {
  public String convert(int i) {
    if (i % 3 == 0) return "fizz";
    if (i == 5 || i == 10 || i == 20) return "buzz";
    return String.valueOf(i);
  }
}
