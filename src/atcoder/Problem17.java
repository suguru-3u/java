package atcoder;

/*
 * https://atcoder.jp/contests/abc408/tasks/abc408_b
 *
 * 問題名：B - Compression
 *
 * TreeSetを使用するとよりシンプルに書くことができる
 *
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Problem17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int[] nums = new int[count];
        ArrayList<Integer> result = new ArrayList<Integer>();
        int tmp = 0;
        for (int i = 0; i < count; i++) {
            nums[i] = scanner.nextInt();
        }

        Arrays.sort(nums);
        for (int num : nums) {
            if (tmp != num) {
                result.add(num);
                tmp = num;
            }
        }

        System.out.println(result.size());

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i != result.size() - 1) {
                System.out.print(" ");
            }
        }

        scanner.close();
    }
}