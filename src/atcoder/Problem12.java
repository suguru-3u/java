package atcoder;

/*
 * https://atcoder.jp/contests/abc412/tasks/abc412_a
 *
 * 問題名：A - Task Failed Successfully
 *
 */


import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayCount = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < dayCount; i++) {
            int goalCount = scanner.nextInt();
            int resultCount = scanner.nextInt();
            if (goalCount < resultCount) {
                sum++;
            }
        }

        System.out.println(sum);

        scanner.close();
    }
}