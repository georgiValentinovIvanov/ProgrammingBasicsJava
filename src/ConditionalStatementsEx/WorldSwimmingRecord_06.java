package ConditionalStatementsEx;

import java.util.Scanner;

public class WorldSwimmingRecord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double metters = Double.parseDouble(scanner.nextLine());
        double timeSec = Double.parseDouble(scanner.nextLine());

        double m = metters * timeSec;
        double delay = Math.floor(metters / 15);

        m = m + (delay * 12.5);


        if (m < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", m);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", m - record);
        }
    }
}
