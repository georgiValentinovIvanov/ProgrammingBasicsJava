package FirstStepsInCodingEx;

import java.util.Scanner;

public class VacationBooksList04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numburPages = Integer.parseInt(scanner.nextLine());
        int pages = Integer.parseInt(scanner.nextLine());
        int numberDays = Integer.parseInt(scanner.nextLine());

        int totalHourSum = (numburPages/pages)/numberDays;

        System.out.println(totalHourSum);
    }
}
