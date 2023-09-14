package MoreExercises;

import java.util.Scanner;

public class VegetableMarket04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vegateblsPrice = Double.parseDouble(scanner.nextLine());
        double fruitsPrice = Double.parseDouble(scanner.nextLine());
        int totalKgVegatebls = Integer.parseInt(scanner.nextLine());
        int totalKgFruits = Integer.parseInt(scanner.nextLine());

        double sumVegatebls = vegateblsPrice*totalKgVegatebls;
        double sumFruits = fruitsPrice*totalKgFruits;

        double totalSum = sumVegatebls+sumFruits;
        double FinalSum = totalSum/1.94;

        String formatSum=String.format("%.2f",FinalSum);

        System.out.println(formatSum);
    }
}
