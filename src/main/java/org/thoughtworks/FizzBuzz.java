package org.thoughtworks;

public class FizzBuzz {


    public String printNumbersFrom1To100() {
        var numbers = new StringBuilder();
        var fizz = "Fizz";

        for (int i=1; i <= 100; i++) {
            if (checkMultipleThree(i)) {
                if (i==100) {
                    numbers.append(fizz);
                } else {
                    numbers.append(fizz).append("\n");
                }
            } else {
                if (i==100) {
                    numbers.append(i);
                } else {
                    numbers.append(i).append("\n");
                }
            }
        }
        System.out.print(numbers);
        return numbers.toString();
    }

    public boolean checkMultipleThree(int number) {
        if (number % 3 == 0) {
            return true;
        }
        return false;
    }
}
