package FirstStepsInCodingEx;

import java.util.Scanner;

public class FoodDelivery07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chikenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int veganMenu = Integer.parseInt(scanner.nextLine());

        double chikenPrice = chikenMenu*10.35;
        double fishPrice = fishMenu*12.40;
        double veganPrice = veganMenu*8.15;
        double totalPrice = chikenPrice+fishPrice+veganPrice;
        double desertPrice = totalPrice*(20/100.0);
        double deliveriPrice = 2.50;
        double finalSum=totalPrice+desertPrice+deliveriPrice;

        System.out.println(finalSum);
    }
}
