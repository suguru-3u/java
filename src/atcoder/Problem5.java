package atcoder;

/*
 *
 * 問題名：B - Most Minority
 *
 */



import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int strLength = sc.nextInt();
        String str = sc.next();
        int targetIndex = strLength - 3;

        if (targetIndex >= 0 && str.substring(targetIndex).equals("tea")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}