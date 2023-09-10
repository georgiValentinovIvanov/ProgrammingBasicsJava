package ConditionalStatementsLab;

import java.util.Scanner;

public class AreaOfFigures07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFigure = scanner.nextLine();
        double area = 0;

        if (typeFigure.equals("square")) {
            double side = Double.parseDouble(scanner.nextLine());
            area = side * side;

        } else if (typeFigure.equals("rectangle")) {
            double lenght = Double.parseDouble(scanner.nextLine());
            double weidth = Double.parseDouble(scanner.nextLine());
            area = lenght * weidth;

        } else if (typeFigure.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            area = Math.PI * radius * radius;

        } else if (typeFigure.equals("triangle")) {
            double base = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            area = base * height / 2;

        }
        System.out.println(area);
    }
}
