package ConditionalStatementsEx.Recap;

public class ConditionalStatementsEx {
    public static void main(String[] args) {

        // 2. Пример за условни конструкции:

        int a = 10;
        int b = 15;

        if (a > b) {
            System.out.println("10 is greater than 15.");
        } else if (a < b) {
            System.out.println("10 is less than 15.");
        } else {
            System.out.println("We can't compare these two numbers.");
        }

        if (a == b) {
            System.out.println("A is equal to B.");
        } else {
            System.out.println("A is not equal to B.");
        }

        if (a > b) {
            System.out.println("A is greater than B.");
        }

        if (a < b) {
            System.out.println("A is less than B.");
        }

        if (a == b) {
            System.out.println("A is equal to B.");
        }

    }
}
