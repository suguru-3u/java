package atcoder;

/*
 * https://atcoder.jp/contests/abc415/tasks/abc415_a
 *
 * 問題名：A - Unsupported Type
 *
 */


import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // インプット
        int count = scanner.nextInt();
        int[] value = new int[count];
        for (int i = 0; i < value.length; i++) {
            value[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();

        // 判定処理
        for (int j : value) {
            if (target == j) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");

        scanner.close();
    }
}