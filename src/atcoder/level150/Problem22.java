package atcoder.level150;

/*
 * https://atcoder.jp/contests/abc383/tasks/abc383_a
 *
 * 問題名：A - Humidifier 1
 *
 */

import java.util.Scanner;

public class Problem22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int totalWater = 0;
        int totalTime = 0;

        for (int i = 0; i < count; i++) {
            int time = scanner.nextInt();
            int water = scanner.nextInt();

            int tmpTime = Math.max(0, time - totalTime);
            totalWater = Math.max(0, totalWater - tmpTime);

            totalTime = time;
            totalWater += water;
        }

        System.out.println(totalWater);

        scanner.close();
    }
}