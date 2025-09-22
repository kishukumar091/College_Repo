/*Codeforces Problem 231A – Team
Problem Statement:
Three friends—Petya, Vasya, and Tonya—are participating in a contest.
For each problem, they know if they can solve it. They will attempt a problem if at least two of them are confident.
The task is to determine how many problems they will attempt.*/

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a + b + c >= 2) {
                count++;
            }
        }

        System.out.println(count);
    }
}
