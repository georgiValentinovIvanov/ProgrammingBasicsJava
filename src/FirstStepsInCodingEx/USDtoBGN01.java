package FirstStepsInCodingEx;

import java.util.Scanner;

public class USDtoBGN01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dolars = Double.parseDouble(scanner.nextLine());
        double leva = dolars * 1.79549;

        System.out.println(leva);
    }
}

