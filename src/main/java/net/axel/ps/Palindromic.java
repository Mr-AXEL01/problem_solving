package net.axel.ps;

import java.util.Scanner;

public class Palindromic {
    private Scanner scanner;

    public Palindromic() {
        this.scanner = new Scanner(System.in);
    }

    public void setPalindromic() {
        System.out.println("Hello friend!");
        System.out.println("Please enter a positive number: ");
        long num = scanner.nextLong();

        if (num < 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        long reversedNum;

        if (isPalindromic(num)) {
            System.out.println("Your number (" + num + ") is already a palindromic number.");
        } else {
            while (!isPalindromic(num)) {
                reversedNum = reverseNum(num);
                long sum = num + reversedNum;
                System.out.println(num + " + " + reversedNum + " = " + sum);
                num = sum;
            }
            System.out.println("The resulting palindromic number is: " + num);
        }
    }

    private long reverseNum(long num) {
        long rem, reversed = 0;

        while (num > 0) {
            rem = num % 10;
            reversed = (reversed * 10) + rem;
            num = num / 10;
        }
        return reversed;
    }

    private boolean isPalindromic(long num) {
        return num == reverseNum(num);
    }
}
