package paiza.最初の一歩.標準入力サンプル問題セット;

import java.util.Scanner;

/**
 * 問題
 * https://paiza.jp/works/mondai/stdin/stdin_n/edit?language_uid=java
 */

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            String s = sc.next();
            System.out.println(s);
        }
    }
}
