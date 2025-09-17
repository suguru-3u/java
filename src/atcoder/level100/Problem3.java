package atcoder.level100;

/*
 * URL:https://atcoder.jp/contests/abc420/tasks/abc420_a
 * 問題名：A - What month is it?
 */

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int plusMonth = sc.nextInt();

        int result = (month + plusMonth) % 12;
        if (result == 0) {
            result = 12;
        }

        System.out.println(result);

        sc.close();
    }
}
