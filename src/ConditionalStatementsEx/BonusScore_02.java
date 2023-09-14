package ConditionalStatementsEx;

import java.util.Scanner;

public class BonusScore_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        double pointBonus = 0.00;

        if (number <= 100) {
            pointBonus = 5;
        } else if (number <= 1000) {
            pointBonus = number * 0.20;
        } else {
            pointBonus = number * 0.10;
        }
        if (number % 2 == 0) {
            pointBonus = pointBonus + 1;
        } else if (number % 10 == 5) {
            pointBonus = pointBonus + 2;
        }
        System.out.println(pointBonus);
        System.out.println(number + pointBonus);
    }
}
