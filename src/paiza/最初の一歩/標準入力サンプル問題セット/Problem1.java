package paiza.最初の一歩.標準入力サンプル問題セット;

import java.util.Scanner;

/**
 * 問題
 * 標準入力で1つの文字列が与えられるので、それを入力して、そのまま1行で出力してください。
 * 　https://paiza.jp/works/mondai/stdin/stdin_1/edit?language_uid=java
 */

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(line);
    }
}
