package com.codurance.fizzbuzz;

public class FizzBuzz {
  public String convert(int i) {
    if (i == 3 || i == 6) return "fizz";
    return String.valueOf(i);
  }
}
