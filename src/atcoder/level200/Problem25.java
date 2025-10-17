package atcoder.level200;

/**
 * https://atcoder.jp/contests/agc001/tasks/agc001_a
 *
 * A - BBQ Easy
 */

import java.util.Arrays;
import java.util.Scanner;

public class Problem25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int[] numbers = new int[count * 2];
        int sum = 0;
        numbers[0] = scanner.nextInt();

        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i += 2) {
            int temp1 = numbers[i];
            int temp2 = numbers[i + 1];
            sum += Math.min(temp1, temp2);
        }

        System.out.println(sum);

        scanner.close();
    }
}
