package org.thoughtworks;

public class FizzBuzz {


    public String printNumbersFrom1To100() {
        var numbers = new StringBuilder();

        for (int i=1; i <= 100; i++) {
            if (i==100)
                numbers.append(i);
            else
                numbers.append(i).append("\n");

            System.out.println(i);
        }

        return numbers.toString();
    }
}
