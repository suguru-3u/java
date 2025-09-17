package atcoder.level100;

/*
 * https://atcoder.jp/contests/abc412/tasks/abc412_a
 *
 * 問題名：A - Task Failed Successfully
 *
 */


import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        int passwordLength = scanner.nextInt();

        System.out.println(passwordLength <= password.length() ? "Yes" : "No");
        scanner.close();
    }
}