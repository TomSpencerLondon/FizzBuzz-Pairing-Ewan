package com.codurance.fizzbuzz;

public class FizzBuzz {
  private int number;

  public static void main(String[] args) {
    FizzBuzz fizzBuzz = new FizzBuzz();
    for (int i = 1; i <= 100; i++) {
      System.out.println(fizzBuzz.convert(i));
    }
  }

  public String convert(int fizzNumber) {
    number = fizzNumber;
    String result = "";

    if (multipleOf(3)) result += "fizz";
    if (multipleOf( 5)) result += "buzz";
    return result == "" ? String.valueOf(number) : result;
  }

  private boolean multipleOf(int i) {
    return number % i == 0;
  }
}
