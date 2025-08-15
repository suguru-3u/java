package paiza.Cランク.標準出力メニュー;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 問題
 * https://paiza.jp/works/mondai/stdout_primer/stdout_primer__specific_split_boss/edit?language_uid=java&t=a0a138ad7fb6ff841a355cfffb4dee8f
 */

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        if (str.length() < 4) {
            System.out.println(str);
            return;
        }

        StringBuilder aws = new StringBuilder();

        int counter = 0;
        for (int i = str.length() - 1; 0 <= i; i--) {
            if (counter == 3) {
                aws.insert(0, ",");
                aws.insert(0, str.charAt(i));
                counter = 0;
            } else {
                aws.insert(0, str.charAt(i));
            }
            counter++;
        }

        System.out.println(aws);
    }

    //    別のやり方
    public void fun(){
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        int mod = n.length() % 3;

        for (int i = 0; i < n.length(); i++) {
            if (i % 3 == mod && i != 0) {
                System.out.print(",");
            }
            System.out.print(n.charAt(i));
        }
        System.out.println();

        sc.close();
    }
}
