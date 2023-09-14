package ConditionalStatementsEx;

import java.util.Scanner;

public class Time15Minutes_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int time = (hour * 60) + min + 15;

        int hours = time / 60;
        int minutes = time % 60;

        if (hours > 23) {
            hours = 0;
        }

        if (minutes < 10) {
            System.out.printf("%d:0%d", hours, minutes);
        } else {
            System.out.printf("%d:%d", hours, minutes);
        }

    }
}
