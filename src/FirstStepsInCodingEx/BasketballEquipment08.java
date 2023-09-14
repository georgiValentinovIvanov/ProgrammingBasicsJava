package FirstStepsInCodingEx;

import java.util.Scanner;

public class BasketballEquipment08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int taxPerYear = Integer.parseInt(scanner.nextLine());

        double basketbollKets = taxPerYear-(taxPerYear*(40/100.0));
        double basketbollEkip = basketbollKets-(basketbollKets*(20/100.0));
        double basketbollBall = basketbollEkip*(25/100.0);
        double basketbollaccessories = basketbollBall*(20/100.0);
        double totalPrice = taxPerYear+basketbollKets+basketbollEkip+basketbollBall+basketbollaccessories;

        System.out.println(totalPrice);

    }
}
