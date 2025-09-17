package atcoder.level100;

/*
 * https://atcoder.jp/contests/abc416/tasks/abc416_a
 *
 * 問題名：A - Vacation Validation
 * containsを使用する方法もある
 *
 */


import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int strCount = sc.nextInt();
        int begin = sc.nextInt();
        int end = sc.nextInt();
        String str = sc.next();

        boolean result = true;
        for (int i = begin - 1; i < end; i++) {
            char ch = str.charAt(i);
            if (ch == 'x') {
                result = false;
                break;
            }
        }

        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}