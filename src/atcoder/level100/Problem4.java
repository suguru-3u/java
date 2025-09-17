package atcoder.level100;

/*
 * https://atcoder.jp/contests/abc420/tasks/abc420_b
 * 問題名：B - Most Minority
 *
 * その回の投票で 0 を選択した人が
x 人、 1 を選択した人が
y 人いたとします。
x=0 または
y=0 である場合、その投票では全員に
1 点が与えられる。
そうでなく
x<y である場合、その投票で 0 に投票した人のみに
1 点が与えられる。
そうでない場合、その投票で 1 に投票した人のみに
1 点が与えられる。
なお、
N が奇数であることから
x=y となることはないことに留意してください。
M 回の投票を終えた後、それらの投票における合計の得点が最も高い人を全員求めてください。
*
* 3 5
11100
10101
01110
出力例 1
Copy
2 3
*
* 5 4
0000
0000
0000
0000
0000
*
* 7 8
11010011
01000000
01111100
10111000
10011110
10100101
10010110
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;


public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int verticalRow = sc.nextInt();
        int horizontalRow = sc.nextInt();
        String[] votes = new String[verticalRow];
        for (int i = 0; i < verticalRow; i++) {
            votes[i] = sc.next();
        }

        int[] sum = new int[verticalRow];
        for (int i = 0; i < horizontalRow; i++) {
            int count0 = 0;
            int count1 = 0;
            for (int j = 0; j < verticalRow; j++) {
                if (votes[j].charAt(i) == '0') {
                    count0++;
                } else {
                    count1++;
                }
            }

            if (count0 == count1) {
                for (int j = 0; j < verticalRow; j++) {
                    sum[j]++;
                }
            } else if (count0 < count1) {
                for (int j = 0; j < verticalRow; j++) {
                    if (votes[j].charAt(i) == '0') {
                        sum[j]++;
                    }
                }
            } else {
                for (int j = 0; j < verticalRow; j++) {
                    if (votes[j].charAt(i) == '1') {
                        sum[j]++;
                    }
                }
            }
        }

        // 最大値を効率的に見つける
        int max = 0;
        if (sum.length > 0) {
            max = Arrays.stream(sum).max().getAsInt();
        }

        // 同点者をリストアップし出力
        List<Integer> winners = new ArrayList<>();
        for (int i = 0; i < sum.length; i++) {
            if (sum[i] == max) {
                winners.add(i + 1);
            }
        }

        // スペース区切りで出力
        for (int i = 0; i < winners.size(); i++) {
            System.out.print(winners.get(i));
            if (i < winners.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        sc.close();
    }
}