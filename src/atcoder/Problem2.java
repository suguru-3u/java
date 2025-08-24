package atcoder;

/*
 * URL:https://atcoder.jp/contests/abc419/tasks/abc419_b
 * 問題名：B - Get Min
 */

import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int loopCount = sc.nextInt();
        // 最小値が先頭に来る優先度付きキューを宣言
        PriorityQueue<Integer> bag = new PriorityQueue<>();

        for (int i = 0; i < loopCount; i++) {
            int type = sc.nextInt();
            if (type == 1) {
                int target = sc.nextInt();
                bag.add(target);
            } else {
                int result = bag.poll();
                System.out.println(result);
            }
        }

        sc.close();
    }
}
