package ConditionalStatementsEx.Recap;

public class Formatting {
    public static void main(String[] args) {


        // 3. Закръгляне и форматиране:

        // Math.ceil();  Закръгля числото нагоре до най-близкото цяло число.
        // Math.floor(); Закръгля числото надолу до най-близкото цяло число.
        // Math.abs(); Взема абсолютната стойност на число.

        // Пример
        {
            double number = 3.2;
            double result = Math.ceil(number);  // 4.0
        }
        {
            double number = 3.7;
            double result = Math.floor(number);  // 3.0
        }
        {
            int number = -5;
            int result = Math.abs(number);  // 5
        }

        // %.2f -> Форматираме до втори знак след десетичната запетая
        {
            double value = 1.23456;
            System.out.printf("Изход: %.60f", value); // Изход: 1.23
        }
    }
}
