package atcoder.level150;

/*
 * https://atcoder.jp/contests/abc389/tasks/abc389_a
 *
 * 問題名：A - 9x9
 *
 */

import java.util.Scanner;


public class Problem21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String str = scanner.next();
       int num1 = Character.getNumericValue(str.charAt(0));
       int num2 = Character.getNumericValue(str.charAt(2));

        System.out.println(num1 * num2);

        scanner.close();
    }
}