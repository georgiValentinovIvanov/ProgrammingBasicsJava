package MoreExercises;

import java.util.Scanner;

public class TrapeziodArea01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double b1 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        double h1 = Double.parseDouble(scanner.nextLine());

        double number = (b1+b2)*h1/2;
        String formattedNumber = String.format("%.2f", number);

        System.out.println(formattedNumber);
    }
}
