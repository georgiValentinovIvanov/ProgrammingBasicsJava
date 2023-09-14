package FirstStepsInCodingEx;

import java.util.Scanner;

public class RadianstoDegrees02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double radian = Double.parseDouble(scanner.nextLine());
        double dagrees = radian * 180 / Math.PI;
        System.out.println(dagrees);
    }
}
