package FirstStepsInCodingEx;

import java.util.Scanner;

public class recap {
    public static void main(String[] args) {
        // 1. Променливи
        // int , double , String
        // {тип}{име}={стойност}
        // int = цели числа
        int age = 25;
        // double = дробни числа
        double lenght=2.5;
        // string = текст
        String name = "Vik";
        // 2. Принтиране
        // -.println(); - добавя нов ред
        //System.out.println(name);
        //System.out.println(age);
        // -.print(); - не добавя нов ред
        //System.out.print(name + "%n");
        //System.out.print(age);
        // -.printf(); -
        // %s -> String
        // %d -> int
        // %f -> double
        //System.out.printf("My name is %s, I`m %d years old.", name , age);

        // 3. Четене от конзолата -> Scanner
        Scanner scanner = new Scanner(System.in);
        String address = scanner.nextLine();
        // 4. Преобразуване -> Parsing
        int number = Integer.parseInt(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());
        System.out.println(address);
        System.out.println(number);
        System.out.println(grade);
    }
}
