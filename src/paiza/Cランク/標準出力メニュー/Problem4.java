package paiza.Cランク.標準出力メニュー;

import java.util.Scanner;

/**
 * 問題
 * https://paiza.jp/works/mondai/stdout_primer/stdout_primer__2dim_array_boss/edit?language_uid=java
 */

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                System.out.print(i * j);
                if (j < n) {
                    System.out.print(" ");
                } else {
                    System.out.println();
                }
            }
        }

        sc.close();
    }
}
