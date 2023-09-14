package ConditionalStatementsMoreEx;

import java.util.Scanner;

public class PipesInPool_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double totalFull = (h*p1)+(h*p2);


        if(totalFull<=v){
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",
                    (totalFull/v*100),(p1*h/totalFull*100),(p2*h/totalFull*100));
        }
        else {
            System.out.printf("For %f hours the pool overflows with %f liters.", h, (totalFull-v) );
        }
    }
}
