package paiza.Cランク.標準出力メニュー;

/**
 * 問題
 * https://paiza.jp/works/mondai/stdout_primer/stdout_primer__space_oneline_boss/edit?language_uid=java
 */

public class Problem1 {
    public static void main(String[] args) {
        for (int i = 1; i < 1001; i++) {
            System.out.print(i);
            if (i < 1000) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
    }
}
