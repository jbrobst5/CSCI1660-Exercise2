package com.jack.csci1660.exercise2;

public class Main {

    /*
    Suppose the high temperature (in degrees Fahrenheit) for each of next week's days are 45, 29, 10, 22, 41, 28, and
    33 and the probability of precipitation for each of the next five days is 95%, 60%, 25%, 5%, 0%, 75%, and 90%.
    Write a program using a loop that displays the day of the week if that day's high temperature is less than or equal
    to 32 and the probability of precipitation is greater than 50% (meaning it's likely to snow).
     */

    public static void main(String[] args) {
        String[] days        = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int[]    highTemps   = {45,       29,        10,          22,         41,       28,         33};
        double[] precChances = {0.95,     0.60,      0.25,        0.5,        0.0,      0.75,       0.90};

        System.out.println("Days that it's likely to snow:");

        for (int i = 0; i < days.length; i++) {
            if (highTemps[i] <= 32 && precChances[i] > 0.5) {
                System.out.printf(" %s\t(%d℉, %f%%)\n", days[i], highTemps[i], (precChances[i] * 100.00));
            }
        }
    }
}
