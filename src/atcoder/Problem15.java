package atcoder;

/*
 * https://atcoder.jp/contests/abc409/tasks/abc409_a
 *
 * 問題名：A - Conflict
 *
 */


import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int itemCount = scanner.nextInt();
        String takahashi = scanner.next();
        String aoki = scanner.next();

        for (int i = 0; i < itemCount; i++) {
            char a = takahashi.charAt(i);
            char b = aoki.charAt(i);
            if (a == 'o' && b == 'o') {
                System.out.println("Yes");
                scanner.close();
                return;
            }
        }
        System.out.println("No");

        scanner.close();
    }
}