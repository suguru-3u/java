package paiza.最初の一歩.標準入力サンプル問題セット;

import java.util.Scanner;

/**
 * 問題
 * 入力される値
 * 3つの文字列が半角スペース区切りで1行で与えれます。
 * <p>
 * 入力値最終行の末尾に改行が１つ入ります。
 * 文字列は標準入力から渡されます。 標準入力からの値取得方法はこちらをご確認ください
 * <p>
 * 期待する出力
 * 3行での出力
 * <p>
 * https://paiza.jp/works/mondai/stdin/stdin_3/edit?language_uid=java
 */

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();
        String[] strs = str.split(" ");
        for (int i = 0; i < count; i++) {
            System.out.println(strs[i]);
        }
    }
}
