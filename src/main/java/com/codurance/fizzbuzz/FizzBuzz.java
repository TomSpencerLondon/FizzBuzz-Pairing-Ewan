package com.codurance.fizzbuzz;

public class FizzBuzz {
  public String convert(int number) {
    String result = "";
    if (number % 3 == 0) result += "fizz";
    if (number % 5 == 0) result += "buzz";
    if (result == "")
      return String.valueOf(number);

    return result;
  }
}
