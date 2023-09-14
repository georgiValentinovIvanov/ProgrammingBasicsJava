package MoreExercises;

import java.util.Scanner;

public class CircleAreaAndPerimeter08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        double area = Math.PI * (r*r);
        double perameter = ((2*Math.PI)*r);

        String formatArea = String.format("%.2f",area);
        String formatPerameter = String.format("%.2f",perameter);

        System.out.println(formatArea);
        System.out.println(formatPerameter);
    }
}
