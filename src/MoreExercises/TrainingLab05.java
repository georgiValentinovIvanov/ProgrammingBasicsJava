package MoreExercises;

import java.util.Scanner;

public class TrainingLab05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine())-1;

        double places = Math.floor(w/1.2);
        double rows = Math.floor(h/0.7);

        double workPlaces = (places*rows)-3;
        String formatWorkPlaces = String.format("%.2f",workPlaces);

        System.out.println(formatWorkPlaces);
    }
}
