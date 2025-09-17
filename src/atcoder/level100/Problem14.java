package atcoder.level100;

/*
 * https://atcoder.jp/contests/abc410/tasks/abc410_a
 *
 * 問題名：A - G1
 *
 */


import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int raceCount = scanner.nextInt();
        int[] horse = new int[raceCount];
        for (int i = 0; i < raceCount; i++) {
            horse[i] = scanner.nextInt();
        }
        int targetAge = scanner.nextInt();
        int participationCount = 0;

        for (int i = 0; i < raceCount; i++) {
            if (horse[i] >= targetAge) {
                participationCount++;
            }
        }

        System.out.println(participationCount);

        scanner.close();
    }
}