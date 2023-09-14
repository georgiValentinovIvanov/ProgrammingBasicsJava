package FirstStepsInCodingLab;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int project = 3;
        int number=Integer.parseInt(scan.nextLine());
        int hoursSum=project*number;
        System.out.println("The architect " + name + " will need " + hoursSum +" hours to complete " + number + " project/s.");
    }
}
