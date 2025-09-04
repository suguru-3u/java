package atcoder;

/*
 * https://atcoder.jp/contests/abc421/tasks/abc421_a
 *
 * 問題名：A - Misdelivery
 *
 */


import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int roomCount = scanner.nextInt();
        String[] livePeoples = new String[roomCount];
        for (int i = 0; i < roomCount; i++) {
            livePeoples[i] = scanner.next();
        }
        int targetRoom = scanner.nextInt();
        String targetName = scanner.next();

        if(livePeoples[targetRoom - 1].equals(targetName)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}