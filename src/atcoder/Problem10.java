package atcoder;

/*
 * https://atcoder.jp/contests/abc414/tasks/abc414_a
 *
 * 問題名：A - Streamer Takahashi
 *
 */


import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int listenerCount = scanner.nextInt();
        int startTime = scanner.nextInt();
        int endTIme = scanner.nextInt();
        int result = 0;

        for (int i = 0; i < listenerCount; i++) {
           int listenerStartTIme = scanner.nextInt();
           int listenerEndTime = scanner.nextInt();

           if(startTime < listenerStartTIme){
               continue;
           }
           if(endTIme > listenerEndTime){
               continue;
           }
           result++;
        }

        System.out.println(result);

        scanner.close();
    }
}