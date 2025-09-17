package atcoder.level100;

/*
 * https://atcoder.jp/contests/abc408/tasks/abc408_a
 *
 * 問題名：A - Timeout
 *
 */


import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        double limit = scanner.nextInt();
        int past = 0;

        for (int i = 0; i < count; i++) {
            int current = scanner.nextInt();
            if (past != 0) {
                if(current - past > limit){
                    System.out.println("No");
                    return;
                }
            }
            past = current;
        }

        System.out.println("Yes");
        scanner.close();
    }
}