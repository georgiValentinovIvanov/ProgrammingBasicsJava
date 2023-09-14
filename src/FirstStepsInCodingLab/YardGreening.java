package FirstStepsInCodingLab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double meters = Double.parseDouble(scan.nextLine());
        double wholeYard = meters * 7.61;
        double discount = wholeYard * 0.18;
        double finalPrice = wholeYard - discount;

        System.out.printf("The final price is: %.2f lv.%n", finalPrice);
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
