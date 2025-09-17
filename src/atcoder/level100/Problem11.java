package atcoder.level100;

/*
 * https://atcoder.jp/contests/abc413/tasks/abc413_a
 *
 * 問題名：A - Content Too Large
 *
 */


import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int itemCount = scanner.nextInt();
        int bugSize = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i < itemCount; i++) {
            int item = scanner.nextInt();
            sum += item;
        }

        System.out.println(bugSize >= sum ? "Yes" : "No");

        scanner.close();
    }
}