package FirstStepsInCodingEx;

import java.util.Scanner;

public class SuppliesforSchool05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int penslCount = Integer.parseInt(scanner.nextLine());
        int markersCount = Integer.parseInt(scanner.nextLine());
        int preparation = Integer.parseInt(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double sumPens = penslCount * 5.80;
        double sumMarkers = markersCount * 7.20;
        double sumPreparation = preparation * 1.20;
        double totalSum = sumPens+sumMarkers+sumPreparation;

        double discountSum = totalSum-(totalSum* (percentDiscount/100.0));

        System.out.println(discountSum);

    }
}
