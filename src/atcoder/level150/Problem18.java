package atcoder.level150;

/*
 * https://atcoder.jp/contests/abc407/tasks/abc407_a
 *
 * 問題名：A - Approximation
 *
 *
 */

import java.util.Scanner;

import static java.lang.Math.round;


public class Problem18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.println(Math.round(a / b));

        scanner.close();
    }
}