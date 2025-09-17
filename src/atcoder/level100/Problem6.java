package atcoder.level100;

/*
 * https://atcoder.jp/contests/abc417/tasks/abc417_a
 *
 * 問題名：A - A Substring
 *
 */


import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int strCount = sc.nextInt();
        int begin = sc.nextInt();
        int end = sc.nextInt();
        String str = sc.next();

        System.out.println(str.substring(begin, strCount - end));

        sc.close();
    }
}