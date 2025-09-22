/*
Codeforces Problem 50A – Domino Piling
Problem Statement:
Given a rectangular board of size M × N, determine the maximum number of 2×1
dominoes that can be placed on the board without overlapping.
* */

import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println((m * n) / 2);
    }
}
