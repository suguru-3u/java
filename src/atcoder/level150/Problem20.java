package atcoder.level150;

/*
 * https://atcoder.jp/contests/abc390/tasks/abc390_a
 *
 * 問題名：A - 12435
 *
 */

import java.util.Scanner;


public class Problem20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        int sum = 0;
        int before = numbers[0];

        for (int i = 1; i < 5; i++) {
            if (sum > 1) break;
            if (before > numbers[i]) {
                sum += 1;
            } else {
                before = numbers[i];
            }
        }

        System.out.println(sum == 1 ? "Yes" : "No");

        scanner.close();
    }
}