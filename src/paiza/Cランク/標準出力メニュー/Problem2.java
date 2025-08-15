package paiza.Cランク.標準出力メニュー;

import java.util.Scanner;

/**
 * 問題
 * https://paiza.jp/works/mondai/stdout_primer/stdout_primer__string_output_boss/edit?language_uid=java
 */

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arrayStr = str.split(" ");

        for(String st : arrayStr){
            System.out.println(st);
        }
    }
}
