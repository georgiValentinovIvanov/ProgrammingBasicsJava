package ConditionalStatementsEx;

import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripBudget = Double.parseDouble(scanner.nextLine());
        int puzzels = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double totalSum = (puzzels*2.60)+(dolls*3.00)+(bears*4.10)+(minions*8.20)+(trucks*2.00);
        int toysCount = puzzels+dolls+bears+minions+trucks;

        if(toysCount>=50){
            totalSum=totalSum-(totalSum*0.25);
        }
        totalSum=totalSum-(totalSum*0.10);

        if(totalSum>=tripBudget){
            System.out.printf("Yes! %.2f lv left.", totalSum-tripBudget);
        }
        else {
            System.out.printf("Not enough money! %.2f lv needed.", tripBudget-totalSum);
        }
    }
}
