package paiza.Cランク.標準出力メニュー;

import java.util.Scanner;

/**
 * 問題
 * https://paiza.jp/works/mondai/stdin_primer/stdin_primer__integer_space_boss/edit?language_uid=java
 */

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arrayLine = str.split(" ");

        for (String line : arrayLine) {
            System.out.println(line);
        }

        sc.close();
    }
}
