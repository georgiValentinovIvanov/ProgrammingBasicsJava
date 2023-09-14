package FirstStepsInCodingLab;

import java.util.Scanner;

public class InchestoCentimeters {
    public static void main (String[] args){
        Scanner console=new Scanner(System.in);
        System.out.println("inches=");
        double inches = Double.parseDouble(console.nextLine());
        double centimeters =2.54*inches;
        System.out.println("centimeters="+centimeters);
    }
}
