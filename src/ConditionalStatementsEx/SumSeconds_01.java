package ConditionalStatementsEx;

import java.util.Scanner;

public class SumSeconds_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstPlayer = Integer.parseInt(scanner.nextLine());
        int secondPlayer = Integer.parseInt(scanner.nextLine());
        int thirdPlayer = Integer.parseInt(scanner.nextLine());

        int totalTime = firstPlayer + secondPlayer + thirdPlayer;

        int min = totalTime / 60;
        int sec = totalTime % 60;

        if (sec < 10) {
            System.out.printf("%d:0%d", min, sec);
        } else {
            System.out.printf("%d:%d", min, sec);
        }

    }
}
