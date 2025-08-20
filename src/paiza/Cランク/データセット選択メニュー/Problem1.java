package paiza.Cランク.データセット選択メニュー;

import java.util.Scanner;

/**
 * 問題
 * https://paiza.jp/works/mondai/data_structure/data_structure__array_step2/edit?language_uid=java
 */

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valueCount = sc.nextInt();
        int[] value = new int[valueCount];
        for(int i = 0; i < valueCount; i++){
            value[i] = sc.nextInt();
        }

        int targetCount = sc.nextInt();
        for(int i = 0; i < targetCount; i++){
            int target = sc.nextInt() - 1;
            System.out.println(value[target]);
        }

        sc.close();
    }
}
