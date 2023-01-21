package org.example;

public class FizzBuzzDemo {

    public String play(int num) {
        if(num == 0) throw new IllegalArgumentException("Number must be non zero");
        if(num%3 == 0 && num%5==0) return "FizzBuzz";
        if(num%3 == 0) return "Fizz";
        if(num%5 == 0) return "Buzz";

        return String.valueOf(num);
    }
}
