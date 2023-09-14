package MoreExercises;

import java.util.Scanner;

public class CelsiustoFahrenheit03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double celsii=Double.parseDouble(scanner.nextLine());

        double farenhain = (celsii*1.8)+32;
        String formatGradus=String.format("%.2f",farenhain);

        System.out.println(formatGradus);
    }
}
