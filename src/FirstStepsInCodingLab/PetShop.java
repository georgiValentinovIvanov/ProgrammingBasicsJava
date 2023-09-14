package FirstStepsInCodingLab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dogs = Integer.parseInt(scan.nextLine());
        int animals = Integer.parseInt(scan.nextLine());
        double dogfoodprice = 2.5;
        int otherfoodprice = 4;

        double allfoodcost = (dogs * dogfoodprice) + (animals * otherfoodprice);

        System.out.printf("%.2f lv.", allfoodcost);

    }
}
