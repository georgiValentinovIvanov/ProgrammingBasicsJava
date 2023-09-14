package FirstStepsInCodingEx;

import java.util.Scanner;

public class Repainting06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double nylonPrice = (nylon+2)*1.50;
        double paintPrice = (paint+(paint *(10/100.0)))*14.50;
        double thinnerPrice = thinner*5.00;
        double bags = 0.40;
        double totalSum = nylonPrice+paintPrice+thinnerPrice+bags;
        double maistorsPrice = totalSum*(30.0/100.0);

        double fintalSum = maistorsPrice*hours;

        System.out.println(fintalSum+totalSum);
    }
}
