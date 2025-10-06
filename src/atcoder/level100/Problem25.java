package atcoder.level100;

/*
 * https://atcoder.jp/contests/abc424/tasks/abc424_a
 *
 * 問題名：A - Isosceles
 *
 */


import java.util.Scanner;

public class Problem25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(a != b && b != c && a != c) {
            System.out.println("No");
            scanner.close();
            return;
        }

        System.out.println("Yes");
        scanner.close();
    }
}