package paiza.最初の一歩.標準入力サンプル問題セット;

import java.util.Scanner;

/**
 * 問題
 * 入力される値
 * 1行目でNが与えらます。
 * 続くN行の各行で文字列が与えられます。
 * <p>
 * 入力値最終行の末尾に改行が１つ入ります。
 * 文字列は標準入力から渡されます。 標準入力からの値取得方法はこちらをご確認ください
 * 期待する出力
 * N行での出力
 * <p>
 * https://paiza.jp/works/mondai/stdin/java/stdin_3_line/result?token=1d80a526250de9035ce44e1d87b742ee
 */

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println(sc.nextLine());
        }
    }
}
