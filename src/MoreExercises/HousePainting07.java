package MoreExercises;

import java.util.Scanner;

public class HousePainting07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double wall = x*y;
        double window = 1.5*1.5;
        double twoWall = wall*2-(window*2);
        double backWall = x*x;
        double entrance = 1.2*2;
        double total = (2*backWall)-entrance;
        double fin = twoWall+total;
        double greenPaints = fin/3.4;

        double roof = 2*(x*y);
        double trianglesToRoof = 2*(x*h/2);
        double totalRoof = roof+trianglesToRoof;
        double redPaints= totalRoof/4.3;

        String formatGreen = String.format("%.2f",greenPaints);
        String formatRed = String.format("%.2f",redPaints);

        System.out.println(formatGreen);
        System.out.println(formatRed);

    }
}
