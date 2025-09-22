/*
Codeforces Problem 318A – Even Odds
Problem Statement:
The sequence of natural numbers from 1 to n is rearranged such that all odd numbers come first,
followed by all even numbers. Given a position k, determine the number at that position in the rearranged sequence.
*/


import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

        long mid = (n + 1) / 2;
        if (k <= mid) {
            System.out.println(2 * k - 1);
        } else {
            System.out.println(2 * (k - mid));
        }
    }
}
