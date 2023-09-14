package ConditionalStatementsEx;

import java.util.Scanner;

public class Shopping_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCarts = Integer.parseInt(scanner.nextLine());
        int ssd = Integer.parseInt(scanner.nextLine());
        int RAM = Integer.parseInt(scanner.nextLine());

        double VideoSum = videoCarts*250;
        double sumSsd = VideoSum*0.35;
        double sumPerOneSsd = ssd*sumSsd;
        double sumRAM = VideoSum*0.10;
        double RAMcena = sumRAM*RAM;

        double TotalSum = VideoSum+sumPerOneSsd+RAMcena;

        if (videoCarts>ssd){
            TotalSum=TotalSum-(TotalSum*(15/100.0));
        }
        if (TotalSum<=budget){
            System.out.printf("You have %.2f leva left!", budget-TotalSum);
        }
        else {
            System.out.printf("Not enough money! You need %.2f leva more!",TotalSum-budget);
        }

    }
}
