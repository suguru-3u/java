package paiza.Cランク.標準出力メニュー;

import java.util.Scanner;

/**
 * 問題
 * https://paiza.jp/works/mondai/stdout_primer/stdout_primer__variable_array_boss/edit?language_uid=java
 */

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int targetCount = sc.nextInt();
        int loopCount = sc.nextInt();

        int[] target = new int[targetCount];
        for (int i = 0; i < targetCount; i++) {
            target[i] = sc.nextInt();
        }

        int[] loop = new int[loopCount];
        for (int i = 0; i < loopCount; i++) {
            loop[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < loopCount; i++) {
            int limit = loop[i] - 1;
            for (int j = 0; j < loop[i]; j++) {
                System.out.print(target[count]);
                if (j < limit) {
                    System.out.print(" ");
                } else {
                    System.out.println();
                }
                count++;
            }
        }

        sc.close();
    }
}
