package atcoder.level150;

/*
 * https://atcoder.jp/contests/abc423/tasks/abc423_a
 *
 * 問題名：A - Scary Fee
 *
 *
 */

import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fixeValue = 1000;

        int balance = scanner.nextInt();
        int commission = scanner.nextInt();

        int maxWithdraw = balance / (fixeValue + commission) ;
        int result = maxWithdraw * 1000;
        if (balance >= result) {
            System.out.println(result);
        } else {
            System.out.println(0);
        }

        scanner.close();
    }
}