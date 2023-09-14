package ConditionalStatementsEx;

import java.util.Scanner;

public class GodzillaVsKong_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int extrasCount = Integer.parseInt(scanner.nextLine());
        double cloutsPerOneExtra = Double.parseDouble(scanner.nextLine());

        double decor = budget*0.10;
        double sumClouts = cloutsPerOneExtra*extrasCount;

        if (extrasCount>150){
            sumClouts=sumClouts-(sumClouts*(10/100.0));
        }
        double totalSum=decor+sumClouts;
        double leftSum=budget-totalSum;


        if(totalSum>budget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", totalSum-budget);
        }
        else if (totalSum<=budget){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", leftSum);
        }
    }
}
