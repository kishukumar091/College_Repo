/* Codeforces Problem 4A – Watermelon
Problem Statement:
Given a watermelon with weight w, determine if it can be divided intotwo parts with even positive
integer weights. The weight must be even and greater than 2 for this to be possible.
*/

import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        if (w > 2 && w % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
