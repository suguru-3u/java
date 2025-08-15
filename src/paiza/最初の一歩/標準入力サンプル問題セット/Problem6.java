package paiza.最初の一歩.標準入力サンプル問題セット;

import java.util.Scanner;

/**
 * 問題
 * https://paiza.jp/works/mondai/stdin/stdin_comma_3/edit?language_uid=java
 */

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arrayStr = str.split(",");

        for (String s : arrayStr) {
            System.out.println(s);
        }
    }
}
