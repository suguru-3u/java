package paiza.Cランク.標準出力メニュー;

import java.util.Scanner;

/**
 * 問題
 * https://paiza.jp/works/mondai/stdout_primer/stdout_primer__format_real_number_boss/edit?language_uid=java
 */

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            double n = sc.nextDouble();
            int m = sc.nextInt();

            String formattedNumber = String.format("%." + m + "f", n);
            System.out.println(formattedNumber);
        }

        sc.close();
    }
}
