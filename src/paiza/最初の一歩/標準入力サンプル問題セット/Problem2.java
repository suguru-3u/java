package paiza.最初の一歩.標準入力サンプル問題セット;

import java.util.Scanner;

/**
 * 問題
 * 標準入力で3行それぞれで文字列が与えられるので、それらを入力して、そのまま3行で出力してください。
 * 　https://paiza.jp/works/mondai/stdin/stdin_1/edit?language_uid=java
 */

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String S = sc.nextLine();
            System.out.println(S);
        }
    }
}
