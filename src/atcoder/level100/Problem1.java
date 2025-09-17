package atcoder.level100;

/**
 * URL:https://atcoder.jp/contests/abc419/tasks/abc419_a
 *
 * 問題名：AtCoder Language
 *
 * 問題文
 * 高橋君は、AtCoder 語を勉強しています。
 * <p>
 * 高橋君は英単語に対して AtCoder 語の単語を対応させて覚えています。
 * <p>
 * 高橋君は英語における red, blue, green は AtCoder 語ではそれぞれ SSS, FFF, MMM に対応していることを覚えており、他の単語は覚えていません。
 * <p>
 * 英小文字からなる文字列
 * S が与えられます。
 * S が高橋君が AtCoder 語との対応を覚えている英単語の表記と一致しているならば
 * S に対応している AtCoder 語の単語を、そうでないならば文字列 Unknown を出力してください。
 * <p>
 * 制約
 * S は長さ
 * 1 以上
 * 10 以下の英小文字からなる文字列
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> mapStr = new HashMap<String, String>();
        mapStr.put("red", "SSS");
        mapStr.put("blue", "FFF");
        mapStr.put("green", "MMM");

        String result = mapStr.get(sc.next());
        if (result == null) {
            System.out.println("Unknown");
        } else {
            System.out.println(result);
        }
    }
}
