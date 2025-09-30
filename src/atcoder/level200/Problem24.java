package atcoder.level200;

/*
 * https://atcoder.jp/contests/abc182/tasks/abc182_b
 *
 * 問題名：B - Almost GCD
 *
 */

import java.util.Scanner;

public class Problem24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int maxCount = 0;
        int answer = 2;
        for (int k = 2; k <= 1000; k++) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] % k == 0) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                answer = k;
            }
        }
        System.out.println(answer);

        scanner.close();
    }
}
