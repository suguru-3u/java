package paiza.Cランク.標準出力メニュー;

import java.util.Scanner;

/**
 * 問題
 * https://paiza.jp/works/mondai/stdout_primer/stdout_primer__print_width_boss/edit?language_uid=java
 */

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int loopCount = sc.nextInt();
        int limitNum = sc.nextInt();

        for (int i = 0; i < loopCount; i++) {
            StringBuilder str = new StringBuilder();
            String target = sc.next();
            int num = limitNum - target.length();

            for (int j = 0; j < num; j++) {
                str.append(" ");
            }
            str.append(target);
            System.out.println(str);
        }

        sc.close();
    }

    // 別のやり方
    public void fun(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();

            System.out.printf("%" + m + "d\n", a);
        }

        sc.close();
    }
}
