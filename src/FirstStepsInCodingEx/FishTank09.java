package FirstStepsInCodingEx;

import java.util.Scanner;

public class FishTank09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int LenghtSM = Integer.parseInt(scanner.nextLine());
        int widthSM = Integer.parseInt(scanner.nextLine());
        int heightSM = Integer.parseInt(scanner.nextLine());
        double percent =Double.parseDouble(scanner.nextLine());

        double volumeAquarium = LenghtSM*widthSM*heightSM;
        double volumeLitters =volumeAquarium/1000;

        double needLitters = volumeLitters*(percent/100.0);

        System.out.println(volumeLitters-needLitters);
    }
}
