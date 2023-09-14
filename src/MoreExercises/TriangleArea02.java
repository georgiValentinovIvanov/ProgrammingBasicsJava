package MoreExercises;

import java.util.Scanner;

public class TriangleArea02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double area = (a*h)/2;

        String formatArea = String.format("%.2f", area);

        System.out.println(formatArea);
    }
}
