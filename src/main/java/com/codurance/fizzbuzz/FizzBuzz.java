package com.codurance.fizzbuzz;

public class FizzBuzz {
  public static void main(String[] args) {
    FizzBuzz fizzBuzz = new FizzBuzz();
    for (int i = 1; i <= 100; i++) {
      System.out.println(fizzBuzz.convert(i));
    }
  }

  public String convert(int number) {
    String result = "";
    if (number % 3 == 0) result += "fizz";
    if (number % 5 == 0) result += "buzz";
    if (result == "")
      return String.valueOf(number);

    return result;
  }
}
