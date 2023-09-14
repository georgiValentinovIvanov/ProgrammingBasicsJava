package ConditionalStatementsEx;

import java.util.Scanner;

public class LunchBreak_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameToSerial = scanner.nextLine();
        int timeToSirialepisod = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());

        double lunchTime = breakTime/8.00;
        double recreationTime = breakTime/4.00;
        double leftTime = breakTime-lunchTime-recreationTime;


        if(leftTime>=timeToSirialepisod){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", nameToSerial , Math.ceil(leftTime-timeToSirialepisod));
        }
        else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", nameToSerial, Math.ceil(timeToSirialepisod-leftTime));
        }
    }
}
