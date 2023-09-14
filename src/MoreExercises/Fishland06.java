package MoreExercises;

import java.util.Scanner;

public class Fishland06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mackerelPriceKg = Double.parseDouble(scanner.nextLine());
        double sprinklePriceKg = Double.parseDouble(scanner.nextLine());
        double bonitoKg = Double.parseDouble(scanner.nextLine());
        double safridKg = Double.parseDouble(scanner.nextLine());
        int musselsKg = Integer.parseInt(scanner.nextLine());

        double bonitoPrice = mackerelPriceKg+(mackerelPriceKg*0.60);
        double bonitoPriceKg = bonitoPrice*bonitoKg;

        double safridPrice = sprinklePriceKg+(sprinklePriceKg*0.80);
        double safridPriceKg = safridPrice*safridKg;

        double muuselsPriceKg = musselsKg*7.50;

        double sum=bonitoPriceKg+safridPriceKg+muuselsPriceKg;

        String formatSum = String.format("%.2f", sum);

        System.out.println(formatSum);

    }
}
