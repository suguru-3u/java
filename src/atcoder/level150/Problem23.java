package atcoder.level150;

/*
 * https://atcoder.jp/contests/abc376/tasks/abc376_a
 *
 * 問題名：A - Candy Button
 *
 */

import java.util.Scanner;

public class Problem23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int interval = scanner.nextInt();

        int beforeTIme = 0;
        int result = 0;

        for (int i = 0; i < count; i++) {
            int currentTIme = scanner.nextInt();
            if (i == 0) {
                beforeTIme = currentTIme;
                result++;
                continue;
            }

            int temp = Math.max(0, currentTIme - beforeTIme);
            if (interval <= temp) {
                result++;
                beforeTIme = currentTIme;
            }
        }

        System.out.println(result);

        scanner.close();
    }
}