package FirstStepsInCodingEx;

import java.util.Scanner;

public class DepositCalculator03 {
    public static void main(String[] args) {
        // 1. Четем от конзолата
        // процент ====> Това е числовата репрезентация на процента!!!
        Scanner scanner = new Scanner(System.in);
        double sum1 = Double.parseDouble(scanner.nextLine());
        int mount = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        // 2. Изчисляваме сумата
        // формула - сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        double totalSum = sum1+mount*((sum1*percent/100)/12);
        // 3. Отпечатваме сумата
        System.out.println(totalSum);

    }
}
